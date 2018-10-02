//Include path module
const path = require('path');

//parse current js file and return an object
var pathObj = path.parse(__filename); //__ --> return current file
console.log(pathObj);

// absolute path starts with " / "
//relative path--> " ./ "

console.log("\n");
pathObj = path.parse("/etc/");
console.log(pathObj);