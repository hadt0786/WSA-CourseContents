import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-contact',
  templateUrl: './contact.component.html',
  styleUrls: ['./contact.component.css']
})
export class ContactComponent implements OnInit {

  constructor() { }

  ngOnInit() {
  }
  
  paymentOptions=[
    {id: 1, method: "Cash"},
    {id: 2, method: "PayTM"},
    {id: 3, method: "Credit Card"},
    {id: 4, method: "Debit Card"},
    {id: 5, method: "Net Banking"}
  ]

  courseNames=[
    {id: 1, method: "Front End Developer"},
    {id: 2, method: "Back End Developer"},
    {id: 3, method: "Full Stack Developer"},
    {id: 4, method: "Java Basics"}, 
    {id: 5, method: "Core Java"}
  ]
    

  captureForm(Form){
    console.log(Form);
    console.log(Form.value.courseInfo.courseName);
  }

}
