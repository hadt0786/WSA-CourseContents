
const mongoose = require('mongoose');

mongoose.connect ('mongodb://localhost/courses-subdocument')
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
    author:authorSchema
}));


createCourse("Node course", new Author({
    name:"Suprita",
    bio : "My bio",
    website : "webstack.com"
    
}));



//listCourses();
async function listCourses()
{
    const courses = await Course.find();
    console.log(courses);


}

//listCourses();


async function createCourse(name, author){
    const course = new Course({
        name,author
    });

    const result = await course.save();
    console.log(result);
}

// async function listCourses(){
//     const course = await Course.find();
//     console.log(courses);

// }

async function updateAuthor(courseId){
    const course = await Course.findById(courseId);
    course.author.name = "UPDate";
    const result  = await course.save();
    console.log(result);

}

//updateAuthor('5b6aa21fa7377d23d74a04f6');
updateAuthor('5b6aa31c36b1c52477f1ae2d');