var http = require('http');

var url = require('url');

function printRequestInfo(req){
    var parseUrl = url.parse(req.url , true);

   // console.log("req.url ",req.url );

    //console.log("url object" , parseUrl);

    //get path
    var path = parseUrl.pathname;
    console.log("Path : "+path);

    var trimmedPath = path.replace(/^\/+|\/+$/g,'');
    console.log("Trimmed Path : "+trimmedPath);

    var queryString = parseUrl.query;
    console.log("QueryString  ",queryString);

    var method = req.method.toLowerCase();
    console.log("Method " , method);

    var header = req.header;
    console.log("header : ",header);

    var user_agent = req.header['user-agent'];
    console.log(user_agent);
}

var server = http.createServer(function(req,res){
    printRequestInfo(req);

    res.end('Hello world\n');

});