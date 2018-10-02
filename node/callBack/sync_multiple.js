const user = getUser(1);
const repos = getRepositories(user.gitHubUsername);
const commits = getCommits(repos[0]);
console.log("Commits : ",commits);

function getUser(id){
    console.log("Reading a user from a dayabse..");
    return ({id:id, gitHubUsername:'Akash'});
}

function getRepositories(username){
    console.log("Callina a gihub API for repos..");
    return (['repos1','repos2','repos3']);
}
function getCommits(repo){
    console.log("Calling a github API for commits..");
    return (['commits']);
}


