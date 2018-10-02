let typeTwo = (message: string) => {
    console.log("TypeScript way of function...arrow function..")
    console.log(message);
}

let messageTwo = 'Test2';
typeTwo(messageTwo);

let typeThree = (message:string)=>{
    let x:number;
    x = message.length;
    return x;
}

let myLength:number;
let messageThree = 'test 3';
myLength = typeThree(messageThree);
console.log(myLength);