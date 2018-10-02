/* Unit test code for courses model */

const { 
    createUser, getAllUser,
     getUserByName, 
    } = require('../models/user');

function testCreateUser() {
    // Create a course document
    createUser({
        username: "testAkash",
        password: "password"
        
    }).then((res) => console.log(res))
        .catch((err) => console.log(err.message));
}

testCreateUser();
// }

// function testGetAllUser() {
//     getAllUser()
//         .then((res) => console.log(res))
//         .catch((err) => console.log(err.message));
// }

// function testGetAllUser() {
//     var id = '5b64022e5737e73d65cf6a57';

//     getCourseById(id)
//         .then((res) => console.log(res))
//         .catch((err) => console.log(err.message));
// }

// function testUpdateCourse() {
//     const course = {
//         _id: '5b64022e5737e73d65cf6a57',
//         name: 'Javascript Programming',
//         author: 'Mubeen',
//     };

//     updateCourse(course)
//     .then((res) => console.log(res))
//     .catch((err) => console.log(err.message));

// }
//testCreateCourse();
//testGetAllCourses();
//testGetCourseById();
//testUpdateCourse();

