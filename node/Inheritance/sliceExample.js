// let sliceExample = "3333";
// var ans = sliceExample.split(/\d/);

// console.log(ans);

// var fs = require('os');

// console.log(fs.totalmem());

var str = "this is the test for shift, push pop";
var array = [];
array = str.split(" ");
console.log("shift",array.shift());
console.log("unshift",array.unshift());
console.log("push",array.push());
console.log("pop",array.pop());

var arraySort = ['120','121','122'];
console.log(arraySort[0].toString(arraySort[0]));
arraySort.sort();
console.log(arraySort);