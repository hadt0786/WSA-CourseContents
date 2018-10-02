
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


async function getALlCourses(){

//query the collection

//const courses = await Course.find();//find all document in a collection

//console.log(courses);

const courses = await Course

    .find(
        // {author:/^AKASH/i},
        // {author:/Jukaku$/i},
        // {author:/.*mubeen.*/i}
        {tags:{$all:['Mean']}}
    )
    //.or(
    // .and(
    //     [
    //         {isPublished: false},
    //         {author:'AKASH'}
    //     ]
    // )
    .select('name author isPublished');



// .find({
//     tags:{$in: ['frontend','backend']}
//     //price:{$gte:10, $lte :20},
//     //author:'NodeJS'
// })
// //.sort('-name')
// .select('name author price');
//.select('name:1, author:1');
console.log(courses);
}

getALlCourses();


//async function getCOursesUsingPagination(



async function getPublishedCOurses(){
    const courses = await Course.find({isPublished:true});
    console.log(courses);
}

//getPublishedCOurses();

//Function : non published courses
async function getPublishedCOursesFalse(){
    const courses = await Course.find({isPublished:false});
    console.log(courses);


//getPublishedCOursesFalse();

async function getAuthor(){
    const courses = await Course.find({author:'AKASH'});
    console.log(courses);
}

//getAuthor();


//return course with author jayakumara

async function getnameSort(){
    const courses = await Course.find()
    .sort({name:-1});
    console.log(courses);
}
getnameSort();

async function getnamelimit(){
    const courses = await Course.find()
    .limit(1);
    console.log(courses);
}
//getnamelimit();
