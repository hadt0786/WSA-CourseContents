/* 
 * Title: Accessing function return value using object destructuring
 */

// Function returns an object
 function doSomething() {
  var obj = {
      error: "This is an error",
      data: "This is data"
  }

  return obj;
}

// Use object destructuring to access the properties
const { error, data } = doSomething();

if (error) {
  console.log(error);
}
else {
  console.log(data);
}

//const myObj = doSomething();
//const { error, data } = myObj;


/*
var result = doSomething();
if (result.error) {
  console.log(result.error);
}
else {
  console.log(result.data);
}
*/