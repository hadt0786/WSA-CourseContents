
function getUser(id){
    // const p = new Promise((resolve, reject)=>{
    //     resolve(1);

    // });

    return new Promise((resolve, reject)=>{
        resolve(1);

    });

    //return p;
}

//const promise = getUser(1);

getUser(1).then(result=>console.log("result is",result))
        .catch(err=>console.log("Error",err.message));


// getUser(1,(user)=>{
//     console.log(user);  
// });

// function getUser(id, callback){
//     setTimeout(()=>{
//         console.log("reading from a database");
//         callback({id:id, gitHubUsername:'Akash'});


//     },2000);
