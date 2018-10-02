function sleep (milliseconds) {
    var start = new Date().getTime();
    for(var i=0; i < 1e7; i++){
        if((new Date().getTime()-start)> milliseconds){
            break;
        }
    }
}
console.log("begin");
setTimeout(function cb(){
    console.log("Time Out");
},0);
var i=5;
while(i>0){
    console.log("end");
    sleep(500);
    i--;
}
//console.log("End");