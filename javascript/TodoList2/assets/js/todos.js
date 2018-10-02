
function newElement() {
    var li = document.createElement("li");
    var inputValue = document.getElementById("myInput").value;
    if (inputValue === '') {
      alert("You must write something!");
    } else {
  //      <li><span><i class="fa fa-trash"></i></span><span><i class="fa fa-edit"></i></span> Go to Position CLass</li>
 //to add del button and append li
  var adddel = document.createElement("span");
  var idel = document.createElement("i");
  var attdel = document.createAttribute("class");       // Create a "class" attribute
  attdel.value = "fa fa-trash";                           // Set the value of the class attribute
  idel.setAttributeNode(attdel); 
  adddel.appendChild(idel);
  li.appendChild(adddel);

  //to add edit button

  var addedit = document.createElement("span");
  var iedit = document.createElement("i");
  var attedit = document.createAttribute("class");       // Create a "class" attribute
  attedit.value = "fa fa-edit";                           // Set the value of the class attribute

  //adding onclick attr for delete
  var onclickDelete = document.createAttribute("onclick");       // Create a "class" attribute
onclickDelete.value = "del(this.parentElement)";
adddel.setAttributeNode(onclickDelete);

  iedit.setAttributeNode(attedit); 
  addedit.appendChild(iedit);
  li.appendChild(addedit);

  
//for an edit button

var onclickEdit = document.createAttribute("onclick");       // Create a "class" attribute
onclickEdit.value = "edit(this.parentElement)";
addedit.setAttributeNode(onclickEdit);

var t = document.createTextNode(inputValue);
li.appendChild(t);


      document.getElementById("myUL").appendChild(li);
    }

}  
function edit(e){
    //e= prompt("what is your edit");



  //to add del button and append li
  var adddel = document.createElement("span");
  var idel = document.createElement("i");
  var attdel = document.createAttribute("class");       // Create a "class" attribute
  attdel.value = "fa fa-trash";                           // Set the value of the class attribute
  idel.setAttributeNode(attdel); 
  adddel.appendChild(idel);
  e.appendChild(adddel);

  //to add edit button

  var addedit = document.createElement("span");
  var iedit = document.createElement("i");
  var attedit = document.createAttribute("class");       // Create a "class" attribute
  attedit.value = "fa fa-edit";                           // Set the value of the class attribute

  //adding onclick attr for delete
  var onclickDelete = document.createAttribute("onclick");       // Create a "class" attribute
onclickDelete.value = "del(this.parentElement)";
adddel.setAttributeNode(onclickDelete);

  iedit.setAttributeNode(attedit); 
  addedit.appendChild(iedit);
  e.appendChild(addedit);

  
//for an edit button

var onclickEdit = document.createAttribute("onclick");       // Create a "class" attribute
onclickEdit.value = "edit(this.parentElement)";
addedit.setAttributeNode(onclickEdit);

e.value = prompt("ENter the text");

}

function del(e){
  e.style.display="none";
    

}