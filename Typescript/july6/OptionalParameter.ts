
function simpleExample(numExample : number , strExample : string, optExample ?: number) : void {
    
    
    console.log(" Inside the function");
    console.log(numExample);
    console.log(strExample);
    console.log(optExample);
}

let firstnumber :number= 1;
let secondNumber :number= 2;
let myString : string = "this is test";
simpleExample(firstnumber, myString, secondNumber);

simpleExample(firstnumber, myString);
