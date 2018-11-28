var jwt = require('jsonwebtoken'); //genrating a JSON WEB TOKEN

const password = "secret";

function genrateToken(payload,callback){
    jwt.sign(payload,password,callback);
}


function verifyToken(payload,callback){
    jwt.sign(payload,password,callback);
}

module.exports.genrateToken = genrateToken;
module.exports.verifyToken = verifyToken;