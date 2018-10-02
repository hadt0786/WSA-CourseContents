/*
 * Title: MongoDB application to create a document
 * Description: Use mongoose to connect to MongoDB and
 * insert documents into a database
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

// Function to create a course
async function createCourse() {
    // Instantiate the Course. Here course represents a document object
    const course = new Course({
        name: "MongoDB",
        author: "Mubeen Jukaku",
        tags: ["database", "NoSQL"],
        isPublished: true
    });

    // Save the document
    const result = await course.save();
    console.log(result);
}

// Create a course document
createCourse();
