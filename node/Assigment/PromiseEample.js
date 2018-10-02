// getCustomer(1, (customer) => {
//   console.log('Customer: ', customer);
//   if (customer.isGold) {
//     getTopbooks((books) => {
//       console.log('Top books: ', books);
//       sendEmail(customer.email, books, () => {
//         console.log('Email sent...')
//       });
//     });
//   }
// });

function notifyCustomer(){
    var customer = {};
    getCustomer(1)
        .then(function(customer){
            console.log('Custome : ', customer);
            if(customer.isGold){
                return getTopbooks();
            }
        })
        .then((books)=>{
            console.log("Top Books : ", books);
            return sendEmail(customer.email, books);

        })
        .then(()=>console.log("Email sent : "));
}

notifyCustomer();

function getCustomer(id){
    return new Promise((resolve, reject)=>{
        setTimeout(()=>{
            resolve({
                id:1,
                name:'John Doe',
                isGold:true.
            })
        })
    })
}


// function getCustomer(id, callback) {
//   return new Promise((resolve, reject)=>{
//      setTimeout(() => {
//     callback({ 
//       id: 1, 
//       name: 'John Doe', 
//       isGold: true, 
//       email: 'email' 
//     });
//   }, 4000);  
// });
// }

// function getTopbooks(callback) {
//     return new Promise((resolve, reject)=>{
//     setTimeout(() => {
//     callback(['book1', 'book2']);
//   }, 4000);
// });
// }

// function sendEmail(email, books, callback) {
//  return new Promise() setTimeout(() => {
//     callback();
//   }, 4000);
// }