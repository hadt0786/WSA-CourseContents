/******************************************************************************
+   Description : Usage of Interface - defined by the user
+   Author      : WebStack Academy (P) Limited
+   Date        : 20/01/2018
/******************************************************************************/
var currentValue = {
    x: 100,
    y: 200,
    z: 300
};
currentValue.x = 500;
console.log("X = " + currentValue.x);
console.log("Y = " + currentValue.y);
console.log("Z = " + currentValue.z);
var ret;
ret.studGrade = 100;
ret.studName = "Hello";
ret.studNumber = 200;
// retObject = typeFour("WSATEST", 80);
console.log("Return:" + ret.studName + ret.studGrade + ret.studNumber);
