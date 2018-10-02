function myOverload (topAndBottom: number, leftAndRight: number);
function myOverload (top: number, right: number, bottom: number, left:
number);
function myOverload(a: number, b?: number, c?: number, d?: number) {
// Function definition or implementation
console.log(myNum1);
console.log(myNum2);
console.log(myNum3);
}
let myNum1: number, myNum2: number, myNum3: number, myNum4: number;
myOverload(myNum1, myNum2);
// Overloading example-1
myOverload(myNum1, myNum2, myNum3, myNum4); // Overloading example-2
myOverload(myNum1, myNum2);

myNum1 = 1;
 myNum2 = 2;
 myNum3 = 3;