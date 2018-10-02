
getCustomer(1, (customer) => {
  console.log('Customer: ', customer);
  if (customer.isGold) {
    getTopbooks((books) => {
      console.log('Top books: ', books);
      sendEmail(customer.email, books, () => {
        console.log('Email sent...')
      });
    });
  }
});

function getCustomer(id, callback) {
  setTimeout(() => {
    callback({ 
      id: 1, 
      name: 'John Doe', 
      isGold: true, 
      email: 'email' 
    });
  }, 4000);  
}

function getTopbooks(callback) {
  setTimeout(() => {
    callback(['book1', 'book2']);
  }, 4000);
}

function sendEmail(email, books, callback) {
  setTimeout(() => {
    callback();
  }, 4000);
}
