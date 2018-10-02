//Import os module

const os = require('os');

var username = os.userInfo().username;
var totalMen = os.totalmem;
var freeMem = os.freemem;

console.log("Username "+username);

console.log("Total Memory "+totalMen);

//abactic $ 
console.log(`Free Memory:${freeMem}` );
