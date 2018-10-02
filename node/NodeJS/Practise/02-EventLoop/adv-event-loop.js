function sleep(millisecond){
    var start = new Date().getTime();
    for(var i = 0 ; i<1e7;i++){
        if((new Date().getTime()-start)>millisecond){
            console.log("true");
        }
    }
}

console.log("begin");

setTimeout(function cb(){

console.log("Time out Asynchronous call in last,, TIME OUT");

},0);// Dealy is ZERO second

var i = 5;
while(i>0){
    console.log("calling the synchronous function first ... end");
    sleep(50);
    i--;
}