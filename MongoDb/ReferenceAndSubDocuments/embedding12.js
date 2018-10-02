
const mongoose = require('mongoose');

mongoose.connect ('mongodb://localhost/courses-references')
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
    author:{
        type:mongoose.Schema.Types.ObjectId,
        ref:'Author'
    }
}));


async function createCourse (name, author){
    const course = new Course ({
        name,
         author
    });

    const result = await course.save();
    console.log(course);
}


async function createAuthor (name, bio, website){
    const author = new Author ({
        name,
        bio, website
    });

    const result = await author.save();
    console.log(result);
}
async function listCourses(){
    const course = await Course
    .find()
    //.populate("author") //fetch reference document
    .populate('author', 'name bio -_id')// - remove the property
    .select('name author');
    console.log(course);
}

//createAuthor('Mubbeen', 'mybio', 'myWebsite');

//createCourse("Node Course", "5b6a96e2f5d0871ff1e6dabf");

listCourses();