/******************************************************************************
+   Description : Usage of Interface - defined by the user 
+   Author      : WebStack Academy (P) Limited
+   Date        : 20/01/2018
/******************************************************************************/

// Pack multiple attributes together, start with CAPITAL LETTER
interface MyCoordinates {
    x: number,
    y: number,
    z: number,
}


let currentValue: MyCoordinates = {
    x:100,
    y:200,
    z:300
}

currentValue.x = 500;

console.log ("X = " + currentValue.x);
console.log ("Y = " + currentValue.y);
console.log ("Z = " + currentValue.z);


