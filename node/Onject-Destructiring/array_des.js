var fruits = ['apple','mango'];
var [first,second] = fruits;

console.log(first) ;
console.log(second);

var[start,...rest] = fruits;

console.log("Start : ",start);
console.log('Rest :',rest);

const{error,data} = doSomething();

if(error){
    console.log(error);
}
else {
    console.log(data);
}

function doSomething(){
    var obj = {
        error:"this is an error",
        data:"this is data"
    }
    return obj;
    
}