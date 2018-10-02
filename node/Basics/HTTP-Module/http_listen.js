const http =require('http');

const server = http.createServer();

server.on('connection',function(){
    console.log("client connection...");
});

server.listen(3000);
console.log("listening on port 3000");