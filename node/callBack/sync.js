// Sync Code

console.log("BEGIN");
function getUser(id){
    console.log("reading user infor from databases///");

    return {id:id,gitHubUsername:'akash'};
}

var user = getUser(1);
console.log(user);

console.log("End");