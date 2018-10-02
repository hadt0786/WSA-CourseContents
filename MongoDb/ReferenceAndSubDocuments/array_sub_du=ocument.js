
const mongoose = require('mongoose');

mongoose.connect ('mongodb://localhost/courses-author-array')
.then(()=>console.log("connected to mongodb"))
.catch((err) => console.error('colud not find',err));


const authorSchema = new mongoose.Schema({
    name:String,
    //add other properties
    bio :String,
    website:String

});
const Author = mongoose.model('Author',authorSchema);

const Course = mongoose.model('Course', new mongoose.Schema({
    name:String,
    authors:[authorSchema]//Array of uthorschema
}));
async function createCourse(name,authors){
    const courses = new Course({
        name,
        authors
    });
    const result = await courses.save();
    console.log(result);
}

createCourse("Node course",[
 new Author({name:"Mubeen"}),
 new Author({name:"Jayakumar"})
]);




async function listCourses()
{
    const courses = await Course.find();
    console.log(courses);


}

//listCourses();

async function addAuthor(courseId, author){
    const course = await Course.findById(courseId);
    course.author.push(author);
    const result = await course.save();
    console.log(result);

}

// addAuthor('5b6be297b21d072b44b9c22f',
// new Author({name :"suprita"}));

async function deleteAuthor(courseId, authorId){
    const course = await Course.findById(courseId);
    const author = course.authors.id(authorId);

    author.remove();
    //course.save();
   const result = await course.save();
   console.log(result);
}
//deleteAuthor('5b6be4f1f3473f2c2b104e99','5b6be4f1f3473f2c2b104e97')

async function updateAuthor(courseId, authorId,author){


const course = await Course.findById(courseId);
const author = course.authors.id(authorId);

course.author.name = "changed";
const result = await course.save();
console.log(result);
}

updateAuthor('5b6be83537a4b12e0d39a23b','5b6be83537a4b12e0d39a239',new Author());
//deleteAuthor('5b6be4f1f3473f2c2b104e99','5b6be4f1f3473f2c2b104e97')
















// async function updateAuthor(courseId)
// }

// async function createCourse(name, author){
//     const course = new Course({
//         name,author
//     });

//     const result = await course.save();
//     console.log(result);
// }
