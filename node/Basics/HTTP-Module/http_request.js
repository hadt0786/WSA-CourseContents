const http =require('http');

const server = http.createServer(function (req, res){
    // res.write("<h1>This is a header file<h1>");
    // res.end("end method to terminate the");

    if(req.url ==='/'){

        res.write("hello world!");
        res.end();

    }
    if(req.url === '/api/courses'){
       res.write(JSON.stringify(['Javascript','Node']));
       
       res.write("<h1>This is a header file<h1>");
        res.end();
    }

}
);
//favicon --> icon on the title bar






server.on('connection',function(){
    console.log("client connection...");
});

server.listen(3000);
console.log("listening on port 3000");