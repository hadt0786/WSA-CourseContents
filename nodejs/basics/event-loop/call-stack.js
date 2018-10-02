function bar(){
    console.log("Bar - Function");
    console.log("begin");
    setTimeout(function cb(){
    console.log("Time Out");
    },5000);
    console.log("End");
}
function foo(){
    console.log("Foo - Function ");
}
function main (){
    console.log("Main - Function ");
    bar();
    foo();
} 
main ();      
