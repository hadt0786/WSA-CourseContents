/******************************************************************************
+   Description : Enumeration type 
+   Author      : WebStack Academy (P) Limited
+   Date        : 20/01/2018
/******************************************************************************/


// Instead of using individual constants const Black = 0, this looks better
// Number of lines also decreased

enum studentGrade { Black, Red, Yellow, Orange, Green};
let myGradeInfo = studentGrade.Orange;

console.log ("Student grade example1 " + myGradeInfo);

// enum studentMarks { thirdClass = 50, secondClass = 55, firstClass = 60 };

enum studentMarks { thirdClass = 50, secondClass, firstClass };
let myClassInfo = studentMarks.secondClass; 

console.log ("Student class example2 " + myClassInfo);

myClassInfo = studentMarks.firstClass;
console.log ("Student class example3 " + myClassInfo);