/*
 * Title: MongoDB application illustraing how to query a collection
 * Description: Use mongoose to connect to MongoDB and
 * query documents from a database
 */

// Import mongoose module
const mongoose = require('mongoose');

// Connect to MongoDB database 'play'
mongoose.connect('mongodb://localhost:27017/play')
    .then(() => console.log("Connected to MongoDB"))
    .catch((err) => console.log("Error: Unable to connect to MongoDB", err));

// Create Course Schema
const courseSchema = new mongoose.Schema({
    name: String,
    author: String,
    tags: [String],
    date: { type: Date, default: Date.now },
    isPublished: Boolean
});

// Create a model from the Schema (Course is a model (Class))
const Course = mongoose.model('Course', courseSchema);

async function getAllCourses() {
    // query a collection using find
    //find all documents inside a collection
    const courses = await Course
        .find();

    console.log(courses);
}

async function getCoursesUsingPagination(pageCount, numOfDocsPerPage) {
    const courses = await Course
        .find()
        .sort({name: 1}) // Sort by name in ascending order
        .skip((pageCount - 1) * numOfDocsPerPage ) // Skip docs to seek to a page
        .limit(numOfDocsPerPage); // Specify no. of documents
        //.count();
        // .limit(3);

    return courses;
}

async function getPublishedCourses() {
    const courses = await Course.find({isPublished: true}); //Query criteria as a parameter
    console.log(courses);
}

async function getNotPublishedCourses() {
    const courses = await Course.find({isPublished: false}); //Query criteria as a parameter
    console.log(courses);
}

async function getCourseByAuthor(author_name) {
    const courses = await Course.find({author: author_name}); //Query criteria as a parameter
    return courses;
}

getAllCourses();

// Un-comment required functions. Specify existing author
// Return course with author 'Mubeen Jukaku'
// getCourseByAuthor('Mubeen Jukaku')
//     .then((courses) => console.log(courses));

// Return published courses
//getPublishedCourses();

// Return non published courses
//getNotPublishedCourses();

// Get courses in a page (Pagination logic is implemented by the function)
// Page - 2, No. of Docs - 3
//getCoursesUsingPagination(2, 3)
//     .then((courses) => console.log(courses));
