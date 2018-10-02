getUser(1,(user)=>{


}
 


//console.log("Commits : ",commits);

function getUser(id,callback){
    console.log("Reading a user from a dayabse..");
    
    setTimeout(()=>{
        callback({id:id, gitHubUsername:'Akash'});
    },2000);

}

function getRepositories(username){
    console.log("Callina a gihub API for repos..");

    setTimeout(()=>{
        callback(['repos1','repos2','repos3']);
    },2000);
    
}
function getCommits(repo){
    console.log("Calling a github API for commits..");
    setTimeout(()=>{
        callback(['commits']);
    },2000);
    
}
