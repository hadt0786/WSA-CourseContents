getUser(1)
    .then(user=>console.log("USer Info : ",user));

function getUser(id){
    return new Promise((resolve, reject)=>{
        setTimeout(()=>
    {
        console.log("reading a user from a databse...");
        resolve({id:id,gitHubUsername:"akash"});
    },2000);
    });
}