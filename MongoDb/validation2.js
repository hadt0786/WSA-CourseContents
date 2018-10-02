// course document



const mongoose = require('mongoose');

// connect to the MongoDb database 'play

mongoose.connect('mongodb://localhost:27017/play')
    .then(()=>console.log("connected to mongod"))
    .catch((err)=> console.log("error",err));

//create a schema 

const courseSchema = new mongoose.Schema({

name:{
    type:String,
    required:true,
    minlength:5,
    maxlength:255,
    //match:/regex/
},
author:String,
tags :[String],
 date:{type:Date, default:Date.now},
isPublished:Boolean,
price:{
    type:Number,
    //required:true
    required : function(){
        return this.isPublished;
        //arrow function will not work
        //this will represent the calling funtion

    }
}
});

//create a model from the schema(Course is a model)



const Course = mongoose.model('Course',courseSchema);

async function createCourse(){
    const course = new Course({
        name:"C Programing language",
        author:"Mubeen",
        tags:["programmming","oops"],
        isPublished:true,
        //price:2 ->will not throw an error now its an optional field
        //price:10

    });
    try{
        let result = await course.validate();
        result = await course.save();
        console.log(result);
    }
    catch (err){
        console.log("Error in your code", err);
    }
}
createCourse();

//using an array always use try catch