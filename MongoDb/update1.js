// course document



const mongoose = require('mongoose');

// connect to the MongoDb database 'play

mongoose.connect('mongodb://localhost:27017/play')
    .then(()=>console.log("connected to mongod"))
    .catch((err)=> console.log("error",err));

//create a schema 

const courseSchema = new mongoose.Schema({

name:String,
author:String,
tags :[String],
 date:{type:Date, default:Date.now},
isPublished:Boolean
});

//create a model from the schema(Course is a model)



const Course = mongoose.model('Course',courseSchema);

//update a course by ID
async function updateCourse(id){
    //Step 1 - Find a Course by ID
    
    
    
    const course = await Course.findById(id);
    if(!course){
        console.log("cannot find course by id" , id);
        return;
    }
    
    //2 Modify the course document
    // course.author ="Jack Williams";
    // course.isPublished = false;

course.set({
    isPublished:true,
    author:"Another Author"
});

    //3. save the document
    const result = await course.save();
    console.log(result);
//    return result;
}

//Invokation update

updateCourse("5b5c02835f9fbd4f668bf869");



