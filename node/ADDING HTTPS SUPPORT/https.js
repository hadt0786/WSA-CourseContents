

var http = require('http');
var https = require('https');
var fs= require('fs');

var config = {
    httpPort:3000,
    httpsPort:3001

};

var httpServer = http.createServer(function (req, res){
    unifiedServer(req,res);
});

httpServer.listen(config.httpPort, function(){
    console.log("The http server is running on port"+config.httpPort)


});

var httpServerOption = {
    'key':fs.readFileSync('./http/key.pem'),
    'cert': fs.readFileSync('./http/cert.pem')

};

var httpsServer = https.createServer(httpServerOption,function(req,res){
    unifiedServer(req,res);
});

httpsServer.listen(config.httpsPort, function(){
    console.log("the HTTPS OS RUNNING ON PORT"+config.httpsPort);
});

var unifiedServer = function (req,res){
    console.log("Incoming request...");
    res.write("Hello world");
    res.end();
};