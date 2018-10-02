//A- Sync Code

console.log("BEGIN");

//Comvert this function to an async function using setTimeOut(2000) -->after 2 sec

function getUser(id,callback){
    console.log("reading user infor from databases///");

        //settimeout will execute after 2 sec

      setTimeout(()=>{
        callback ({id:id,gitHubUsername:'akash'});

      },2000);  
      console.log("getUser returned");
}

//var user = getUser(1);Not valid for async function
getUser(1,function(user){
    console.log("UserInfo ",user);  
});
//console.log(user);

console.log("End");