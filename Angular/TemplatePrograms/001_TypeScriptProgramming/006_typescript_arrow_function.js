/******************************************************************************
+   Description : Arrow Function usage - Various ways
+   Author      : WebStack Academy (P) Limited
+   Date        : 20/01/2018
/******************************************************************************/
// Old JavaScript way of calling a function...
var typeOne = function (message) {
    console.log("JavaScript way of function...normal function");
    console.log(message);
};
var messageOne = 'Test1';
typeOne(messageOne);
// Arrow function, note the syntax 
var typeTwo = function (message) {
    console.log("TypeScript way of function...arrow function..");
    console.log(message);
};
var messageTwo = 'Test2';
typeTwo(messageTwo);
// Arrow function with returning a primitive integer 
var typeThree = function (message) {
    var x;
    x = message.length;
    return x;
};
var myLength;
var messageThree = 'Test3';
myLength = typeThree(messageThree);
console.log(myLength);
var typeFour = function (studentInput) {
    // Ensure you initialize interface elements, failing which you will get compilation error 
    var value = { overallMarks: 0, overallBand: null };
    value.overallMarks = studentInput.myTest + studentInput.myAttendance + studentInput.myAssignments + studentInput.myProject;
    value.overallBand = "Green";
    return value;
};
var resultValue;
var student = { myAttendance: 0, myAssignments: 0, myProject: 0, myTest: 0 };
student.myAttendance = 20;
student.myAssignments = 20;
student.myProject = 20;
student.myTest = 25;
resultValue = typeFour(student);
console.log(resultValue.overallMarks);
console.log(resultValue.overallBand);
// Arrow functions for simple expressions. Return is not required.
var typeFive = function (a) { return (a + 1); };
var fiveTest = 5;
fiveTest = typeFive(fiveTest);
console.log(fiveTest);
