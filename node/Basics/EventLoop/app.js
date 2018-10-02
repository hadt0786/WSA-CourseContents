const Logger = require('logger.js'); //Logger is a class

//create logger object

const logger = new Logger();

logger.on('messadeLogged', function (args){
    console.log('Event : message logged',args);
});

logger.log("hello world");