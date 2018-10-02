main();

function main(){
    console.log("in main");
    foo();
}
function foo(){
    console.log("2 stack");
    bar();
}
function bar(){
    console.log(" end");
    
}