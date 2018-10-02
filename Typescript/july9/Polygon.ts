function myPolygon (topAndBottom: number, leftAndRight: number);
function myPolygon (top: number, right: number, bottom: number, left:
number);
function myPolygon(a: number, b?: number, c?: number, d?: number) {
// Function definition or implementation
if(a===undefined){
    console.log("Not a ploygon");
}
else if(b===undefined){
    console.log("its a line");
    
}else if(c===undefined){
    console.log("rectangle");
}
}

let myNum1: number, myNum2: number, myNum3: number, myNum4: number;
myOverload(myNum1, myNum2);
// Overloading example-1
myOverload(myNum1, myNum2, myNum3, myNum4); // Overloading example-2
myOverload(myNum1, myNum2);

myNum1 = 1;
myNum2 = 2;
myNum3 = 3;