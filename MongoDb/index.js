
//IMport the mongoose module

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

async function createCourse(){

// Instantiate a classs - lower case course, class Course

const course = new Course({
    name:"Java",
    author:"AKASH",
    tags : ['program','frontend'],
    isPublished:true
});

//Insert or Save into the database

const result = await course.save();
console.log(result);
}

//Invoke create Course
createCourse();

