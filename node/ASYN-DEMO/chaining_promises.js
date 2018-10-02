getUser(1)
    .then(user => getRepositories(user.gitHubUsername))
    .then(repos=> getCommits(repos[0])
    .then(commits => console.log("commits :", commits))
    .catch(err => console.log("Promise failed"));
    
    function getUser(id){
        return new Promise ((resolve, reject)=>{
            setTimeout(()=>{
                console.log('Reading a user from a databse..');
                resolve({id:id,gitHubUsername:'AKASH'});
            },2000);
        });
    }

    function getRepositories(username){
        return new Promise ((resolve, reject)=>{
            setTimeout(()=>{
                console.log('Calling a GITHUB repos.....');
                resolve(['repos1','repos2','repos3']);
            },2000);
        });
    }

    function getCommits(repo){
        return new Promise ((resolve, reject)=>{
            setTimeout(()=>{
                console.log('Calling a GITHUB API COMMIT..');
                resolve();
            },2000);
        });
    }