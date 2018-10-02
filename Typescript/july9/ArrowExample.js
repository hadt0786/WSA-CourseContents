var typeTwo = function (message) {
    console.log("TypeScript way of function...arrow function..");
    console.log(message);
};
var messageTwo = 'Test2';
typeTwo(messageTwo);
var typeThree = function (message) {
    var x;
    x = message.length;
    return x;
};
var myLength;
var messageThree = 'test 3';
myLength = typeThree(messageThree);
console.log(myLength);
