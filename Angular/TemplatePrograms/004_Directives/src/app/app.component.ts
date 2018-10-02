import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'app';
  coursesList = ["Full Stack","Mean Stack","Front End","Back End"];
  // coursesList = [];
  courseNumber = 2;

  studentList: any[] =[
    {
      "name": "001"
    },
    {
      "name": "002"
    },
    {
      "name": "003"
    },
    {
      "name": "004"
    },
  ]

  userInput = "Default Text";

  userKeyPress()
  {
    console.log("The user has entered the value" + this.userInput);
  }

  addNewCourse(){
    this.coursesList.push("Devops");
  }

  removeCourse(){
    this.coursesList.pop();
  }
}
