const p1= new Promise((resolve,reject)=>{
    setTimeout(()=>{
        console.log('Async operation 1..');
        resolve(1);
    },2000);
});

const p2= new Promise((resolve,reject)=>{
    setTimeout(()=>{
        console.log('Async operation 2..');
     // testing error   
     //resolve(2);
     reject("Some error");
    },3000);
});

// Promise.all([p1, p2])
//     .then(result=>console.log(result))
//     .catch(err=>console.log('Errr', err.message));

Promise.race([p1, p2])
    .then(result=>console.log(result))
    .catch(err=>console.log('Errr', err.message));

