// Include the required modules
const { createCourse, getAllCourses, getCoursesById, updateCourses } = require('../models/courses');
const express = require('express');
const Joi = require('joi'); // JSON validation

const route = express.Router();

//Route handler for get all courses
route.get('/', (req, res) => {
    //Get all courses
    getAllCourses()
    .then((result) =>{
        res.send(result);
    })
    .catch((err) =>{
        res.status(500);
        res.send("Error :", err.message);
    })
});

//API with param id
route.get('/:id', (req, res) => {
    const id = req.params.id;
    //Get the Courses object using id 
    getCoursesById(id)
    .then((result) =>{
        res.send(result);
    })
    .catch((err) =>{
        res.status(404);
        res.send("Error :", err.message);
    })
});

/****************** END: get requests *************/

/****************** BEGIN: post requests *************/

// POST API to create a new course
route.post('/', (req, res) => {
    // Validate the course info
    const { error } = validateCourse(req.body);
    
    if (error) {
        res.status(400);
        res.send(error.details[0].message); // Sending 1st error message
        console.log(error);
        return;
    }

    // Add course to db
    createCourse(req.body)
        .then((result) => {
            res.send(result);
            console.log("Created a new course: ", result.name);
        })
        .catch((err) => {
            res.status(500);
            res.send("Error: Unable to create course\n", err.message);
            console.log("Error: Unable to create course\n", err);
        });
});

/****************** END: post requests *************/

/****************** BEGIN: PUT requests *************/
// Handler to update a course using put method
route.put('/:id', (req, res) => {
    
    const id = req.params.id;
    
    //Get the Courses object using id 
    updateCourses()
    .then((result) =>{
        course.author=req.body.author;
        res.send(result);
    })
    .catch((err) =>{
        res.status(404);
        res.send("Error :", err.message);
    }) 
});

// Handler to delete a course using delete method
route.delete('/:id', (req, res) => {
    // Look up the course. If not found return 404

});

// Validate function
function validateCourse(course) {
    // Define schema
    const schema = {
        name: Joi.string().min(4).max(60).required(),
        author: Joi.string().min(4).max(60).required(),
        tags: Joi.array().items(Joi.string()),
        date: Joi.date(),
        price: Joi.number(),
        isPublished: Joi.boolean()
    };

    // Validate
    const result = Joi.validate(course, schema);

    return result;
}

module.exports = route;