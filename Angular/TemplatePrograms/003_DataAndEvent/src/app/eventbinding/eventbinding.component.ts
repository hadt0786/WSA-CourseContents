import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-eventbinding',
  templateUrl: './eventbinding.component.html',
  styleUrls: ['./eventbinding.component.css']
})
export class EventbindingComponent implements OnInit {
  mySaveFunction(){
    console.log("Button was pressed--> Button Handling");
  }
  mySaveFunctionWithEvent($event){
    console.log("The Event object: " +$event);
  }
  myDivButtonEvent(){
    console.log("Button was pressed--> Div Handler");
  }
  myKeyPress(){
    console.log("User has given input and press enter");
  }
  myKeyPressWithValue(givenInput){
    console.log("user has given the input and press enter");
  }
  mySaveFunctiontwoWithEvent($event){
    console.log("Bubbling");
    $event.stopPropagation();
  }
  bgcolor = "Red";
  myFun(){
    this.bgcolor= "green";
  }
  constructor() { }

  ngOnInit() {
  }

}
