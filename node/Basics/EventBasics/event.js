//include events modules

const EventEmitter = require('events');

//Instantiate an object
const emiter = new EventEmitter();

emiter.addListener("bikeCrashed", function(){
    console.log("call the ambulance");
});


emiter.on("bikeCrashedWithInfo", function(info){
    console.log("Info : "+info);
});


emiter.emit('bikeCrashedWithInfo',100);
emiter.emit('bikeCrashed');
//emiter.emit('bikeCrashed');emiter.emit('bikeCrashed');