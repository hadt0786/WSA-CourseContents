/* Unit test code for courses model */

const {createCourse, getAllCourses} = require('../models/courses');

function testCreateCourse() {
    // Create a course document
    createCourse({
        name: "C++ Programming Language",
        author: "Mubeen Jukaku",
        price: 15,
        isPublished: true
    }).then((res) => console.log(res))
        .catch((err) => console.log(err.message));
}

function testGetAllCourses() {
    getAllCourses()
        .then((res) => console.log(res))
        .catch((err) => console.log(err.message));
}

//testCreateCourse();
//testGetAllCourses();
