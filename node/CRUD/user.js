const fs = require('fs');
let obj2 = {  
    name: 'john',
    age: 23, 
    gender: 'Male',
    number: '8951211113',
    email: 'divek.jes@gmail.com',
};


var dirName=__dirname+"/data/users/";

function createUser(user ,overwrite){

    if ( !fs.existsSync(dirName+user.number+'.json',(err)=>{console.log("error")}) ||overwrite ) {
        var data = JSON.stringify(user);  
            fs.writeFile(dirName+user.number+'.json',data,(err)=>{
                (err)?console.log("Some error ocurred"):console.log('\nStored data sucessfully');
            });    
    }
    else{
        console.log("\nUser Already exist");
    }
   


}

function readUser(phonenum){
    if (fs.existsSync(dirName+phonenum+'.json')) {
        var readdata;
        fs.readFile(dirName+phonenum+'.json', 'utf8', function (err, data) {
          if (err)console.log("Error");
          readdata = JSON.parse(data);
                   console.log('\n Reading Data from file....\n\n' );
          console.log(readdata);
     


        });
    }
    else{
        console.log("error User does not exsist ");
        }
    

}

function updateUser(number,obj2){
    if (fs.existsSync(dirName+number+'.json')) {
        var readdata;
        fs.readFile(dirName+number+'.json', 'utf8', function (err, data) {
          if (err)console.log("Error");
          readdata = JSON.parse(data);
         if(obj2.name){readdata.name=obj2.name;}
           if(obj2.age){readdata.age=obj2.age;}
             if(obj2.number){readdata.number=obj2.number;}
               if(obj2.gender){readdata.gender=obj2.gender;}
                 if(obj2.email){readdata.email=obj2.email;}
                console.log('\n' );
         console.log("\nUpdate Sucess Reading file with phone number  ...'"+obj2.number+"'");
            createUser(readdata,1);
        setTimeout(()=>{readUser(obj2.number)},2000);
       
        });
    }
    else{
        console.log("error User does not exsist ");
        }

// createUser(readdata,1);
}
    
function delUser(phonenum){
     console.log('\nDeleting JSON data file......');
    if (fs.existsSync(dirName+phonenum+'.json',(err)=>{console.log("error")})) {
            fs.unlink(dirName+phonenum+'.json',(err)=>{
                if(err){
                    console.log('error ocurred while deleting');
                }
                else{
               
                    console.log('\nDelete user sucess for '+phonenum+':)');
                }
    
            });     
    }
    else{
        console.log('file does not exist');
    }
    }


module.exports.updateUser = updateUser;
module.exports.createUser = createUser;
module.exports.delUser = delUser;
module.exports.readUser = readUser;
