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
async function removeCourse(id){

    //Direct update
   // const result = await Course.deleteOne({_id:id});
    //const result = await Course.findByIdAndRemove(id);
       const result = await Course.deleteMany({
           isPublished:false});

    console.log(result);


}

//Invokation update

removeCourse("5b5c02835f9fbd4f668bf869");



