var express = require('express');

var app = express();

//
app.get('/',function(req,res){
    console.log("Hello host");
});

var server = app.listen(8000,function(){
    var host = server.address().address;
    var port = server.address().port;
    console.log("server is listening at http://localhost",port);
  
});