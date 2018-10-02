



const mongoose = require('mongoose');

mongoose.connect('mongodb://localhost:27017/mongo-exercises')
    .then(()=>console.log("connected To MongoD"))
    .catch((err)=> console.log("error",err));

const courseSchema = new mongoose.Schema({

    name : String,
    author:String,
    tags:[String],
    date:{type:Date,default:Date.now},
    isPublished :Boolean,
    price :Number
});

const Course = mongoose.model('Course',courseSchema);

// //1. Get all the courses. But print only name, author and price

// async function getAllTheCourses(){

//     const courses = await Course
//         .find()
//         .select('name author price');
//         console.log(courses);

// }

// getAllTheCourses();

// console.log("2. Get total number of courses")

// async function getAllTheTotalCourses(){

//     const courses = await Course
//         .find()
//         .select('name author price');

//         console.log("2. Get total number of courses",courses.length);

// }

// getAllTheTotalCourses();

//Get total courses that are published

// console.log("// 3. Get total courses that are published");

// async function getAllTheTotalCoursesPublished(){

//     const courses = await Course
//         .find(
//             {isPublished:true}
//         )
//         .select('name author published');
//         console.log(courses);
//         console.log("Course PUBLISHED",courses.length);

// }

// getAllTheTotalCoursesPublished();

// 4. Get courses whose price is less than 20.
 //Sort by price in ascending order. Display only name and price.

// async function getAllThePriceLte20(){

//     const courses = await Course
//         .find(
//             {price:{$lt:20}}
//         )
//         .sort('-price')
//         .select('name price');
//         console.log(courses);
//         console.log("Course PUBLISHED",courses.length);

// }
// getAllThePriceLte20();

// 5. Get courses whose price is between 10 and 20. 
//Sort by price in descending order. Display only name and price.

// async function getAllThePriceBtw10And20(){

//     const courses = await Course
//         .find(
//             {price:{$gte:10,$lte:20}}
//         )
//         .sort('price')
//         .select('name price');
//         console.log(courses);
//         console.log("Course PUBLISHED",courses.length);

// }
// getAllThePriceBtw10And20();

// 6. Get top 5 cheapest courses. 
// Sort by  price in ascending order. Display name, author, price.

// async function getAllThePriceBtw10And20(){

//     const courses = await Course
//         .find({
//             price:{$exists:false}
//         })
//         .sort('price')
//         .limit(5)
//         .select('name author price');
//         console.log(courses);
//         console.log("Course PUBLISHED",courses.length);

// }
// getAllThePriceBtw10And20();

// 7. Get top 5 expensive courses. 
//Sort by  price in descending order. Display name, author, price.

// async function getExpensiveCourse(){

//     const courses = await Course
//         .find()
//         .sort('price')
//         .limit(5)
//         .select('name author price');
//         console.log(courses);
//         console.log("Course PUBLISHED",courses.length);

// }
// getExpensiveCourse();


// 8. Get courses published by author name. 
//Author name should be a parameter to function.
// Display name, author, isPublished.

// async function getCourseByAuthor(){

//     const courses = await Course
//         .find(
//             {
//                 author:'Mubeen'
//             }
//         )
        
        
//         .select('name author isPublished');
//         console.log(courses);
//         console.log("Course length",courses.length);

// }
// getCourseByAuthor();

// 9. Get all courses with tag embedded. 
//Display name, tags


async function getCourseByAuthor(){

    const courses = await Course
        .find(
            {
                author:'Mubeen'
            }
        )
        
        
        .select('name author isPublished');
        console.log(courses);
        console.log("Course length",courses.length);

}
//getCourseByAuthor();


// 10. Get all courses that does not contain embedded. 
//Display name, tags.

async function getCourseNotEmbedded(){

    const courses = await Course
        .find(
            {
            name:{$not:/.*embedded.*/i}
            }
        )
        
        
        .select('name tags');
        console.log(courses);
        console.log("Course length",courses.length);

}
//getCourseNotEmbedded();

// 11. Get courses either created by "Jayakumar", or by "Adil".
// Sort by name.

async function getCourseByJayakumarOrAdil(){

    const courses = await Course
        .find()
        .or([{author:/Jayakumar/},{author:/Adil/}])
        .sort('name')
        .select('name author tags');
        console.log(courses);
        console.log("Course length",courses.length);

}
//getCourseByJayakumarOrAdil();

// 12. Get all the published backend courses (tags), sort them by name. 
//Display name and author.

async function getCourseByTags(){

    const courses = await Course
        .find({
            tags:{$in:'backend'}
        })
        .sort('name')
        .select('name author ');
        console.log(courses);
        console.log("Course length",courses.length);

}
//getCourseByTags();

// 13. Get all the published frontend and backend courses, 
//sort by price in descending order. Display name and author.


async function getCourseByTagsFrontendAndBackend(){

    const courses = await Course
        .find({
            tags:{$in:['backend','frontend']}
        })
        .sort('-price')
        .select('name author ');
        console.log(courses);
        console.log("Course length",courses.length);

}
//getCourseByTagsFrontendAndBackend();

// 14. Get all the published courses with price more than 15, 
//or have the word "by" in their title.

async function getCourseByPriceMoreThan15(){

    const courses = await Course
        .find()
        .or(
            [{
                price:{$gte:15}},
                {title:/.*by.*/g}
            ]
        )
        .sort('-price')
        .select('name author ');
        console.log(courses);
        console.log("Course length",courses.length);

}
//getCourseByPriceMoreThan15();

// 15. Get courses which does not have property price
async function getCourseByProperty(){

    const courses = await Course
        .find({price:{$exists:false}})

        .select('name author');
        console.log(courses);
        console.log("Course length",courses.length);

}
getCourseByProperty();

