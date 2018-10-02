//Include fs module
const fs = require('fs');

//use readdir synchronous / blocking function
// const files = fs.readdirSync('.');


// console.log(files);

// console.log("\n");

// console.log(fs.readdirSync('/home'));

// console.log("\n");
// try{
// console.log(fs.readdirSync('hgfd.'));
// }
// catch(err){
//     console.log(err.message);
// }

// fs.readdir('.',function (err,files){
//     if(err)
//     console.log("Error",err);
//     else
//     console.log('Result',files);

// });

// console.log("Awaiting result from readdir");

function readdirCompleted(err, files)
{
    if(err)
    console.log("Error",err);
    else {
        console.log("result",files);
    }

}
//Argument 1 - path Arg 2 - calback function
fs.readdir('.',readdirCompleted);

console.log("Awaiting result from readdir ");