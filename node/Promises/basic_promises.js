const p = new Promise((resolve, reject)=>{
    console.log("Executing a promise");
    resolve(1);
//    reject((new Error('This is an Error')));
});

// p.then(
//     function(result){
//         console.log("Result", result);
//     },

//     function(err){
//         console.log('Error',err.message);

//     }
// );

//Arrow 

// p.then(
//     (result)=>console.log('Result',result),
//     (err)=>console.log('Error',err.message);
// );

p.then(result => console.log('Result',result)).catch(err => console.log('error',err.message));
