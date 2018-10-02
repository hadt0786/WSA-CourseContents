
//create a user

/*
 * Title: The user model implementation
 * Description: Implements APIs for performing CRUD operations
 * on MongoDB.
 * APIs can be invoked by route handlers. 
 */

// Import mongoose module
const mongoose = require('mongoose');

// Connect to MongoDB database 'courses=db'
mongoose.connect('mongodb://localhost:27017/courses-db', { useNewUrlParser: true })
    .then(() => console.log("Connected to MongoDB"))
    .catch((err) => console.log("Error: Unable to connect to MongoDB", err));

// Create User Schema
const userSchema = new mongoose.Schema({
    username: {
        type: String,
        required: true,
        minlength: 4,
        maxlength: 60
    },
    password: {
        type: String,
        required: true,
        minlength: 4,
        maxlength: 60
    }
});

// Create a model from the Schema (Course isUserel (Class))
const User = mongoose.model('User', userSchema);

/* Get All courses 
 * IN: None. TODO: Add filter params
 * OUT: Courses collection in JSON format
 */
async function getAllUser()  {
 try {
        const user = await User.find().select('-password');
        return user;
    }
    catch (err) {
        console.log("Error: Unable to query database");
        throw err;
    }
}

/* Get course by ID
 * IN: id (course object ID)
 * OUT: Single course object
 */
async function getUserByName(username) {
    try {
        const user = await User.findOne({username : username});
        return user;
    }
    catch (err) {
        console.log("Error: Unable to query database");
        throw err;
    }
}

/* Create a user if it exist
 * IN: Course object
 * Output: Course Object, including object id
 */
async function createUser(userInfo) {
    

    // Instantiate the Course. Here course represents a document object


    // Validate and save the document
    try {

        const user =await getUserByName(userInfo.username);

        if(user){
            
        }

        // Use validate method to validate a document
        
        var err = new Error("user already exist");
        console.log(`User Alrea ${user} already exist`);
        return err;
        
    }
    catch (err) {
        
        const user = new User(userInfo);

        try{

        var result = await user.validate();
        result  = await user.save();
        
        return result;

        }
        catch(err){
            console.log("Error user is");
            throw err;
        }

    }
}



/* Update a course by ID
 * IN: Course object, including object id
 * OUT: Updated course object
 */
async function updateCourse(courseInfo) {
    const id = courseInfo._id;
    // find the document - findById()
    try {
        let course = await Course.findById(id);
        if (!course) {
            console.log("Error: Cannot find course with ID: ", id);
            throw new Error("Course not found");
        }

        // Modify its properties
        course.set(courseInfo);
        // save the document - save()
        const result = await course.save();
        return result;
    }
    catch(err) {
        console.log("Error: Cannot save course with ID: ", id);
        throw err;
    }
}


/* Delete a course by ID
 * IN: id (course object ID)
 */

module.exports.createUser = createUser ;
module.exports.getAllUser = getAllUser;
module.exports.getUserByName = getUserByName;


