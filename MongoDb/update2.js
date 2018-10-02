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

    //Direct update
    const course = await Course.findByIdAndUpdate(id,{
        $set:{
            author:"Satya",
            isPublished:true
        }
    },{new:true});

    console.log(course);


}

//Invokation update

updateCourse("5b5c02835f9fbd4f668bf869");



