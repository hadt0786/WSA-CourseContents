const EventEmitter = require("events");

class Logger extends EventEmitter{
    log(message){
        console.log("message");

        this.emit('messageLogges', new Date());
    }

    


}
// var logger  = new Logger();
//     logger.log("hello");

    modules.exports = Logger;


