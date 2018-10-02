const user = require('./user'); 

let realData = {  
    name: 'john',
    age: 23, 
    gender: 'Male',
    number: '8951271113',
    email: 'divek.jes@gmail.com',
};

let updatedata = {  
    name: 'Aki',
    age: 28, 
    gender: 'Male',
    number: '8954621173',
    email: 'Akash@gmail.com',
};


function deluser(){
	user.delUser(8951271113);
}
function readuser(){

	user.readUser(8951271113);

}
function updateuser(){
	user.updateUser(8951271113,updatedata);
}
user.createUser(realData,0);
 setTimeout(readuser,2000);
  setTimeout(updateuser ,3000);
    setTimeout(deluser,8000);

