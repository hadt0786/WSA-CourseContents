/* Unit test code for courses model */

const {createCourse, getAllCourses,getCourseById} = require('../models/courses');

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

function testGetCourseById() {
    var id = '5b62a1ea68dc1c4cf6806dc6';
    getCourseById(id)
        .then((res) => console.log(res))
        .catch((err) => console.log(err.message));
}
testGetCourseById();
//testCreateCourse();
//testGetAllCourses();
