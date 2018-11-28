

const {verifyToken} = require('../utils/auth');

function authToken(req, res, next){

var token = req.header("authorization");
    token  = token.split(" ");
    token = token[1];

    verifyToken(token, function(err,payload){
        if(err){
            //send the error
            res.status(401).send("Error Invalid  user token");
            console.log("Error Invalid token");
            return;
        }
        else {
            next();
        }
    });
}

module.exports=authToken;