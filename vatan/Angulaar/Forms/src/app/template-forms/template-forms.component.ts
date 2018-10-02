import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-template-forms',
  templateUrl: './template-forms.component.html',
  styleUrls: ['./template-forms.component.css']
})
export class TemplateFormsComponent implements OnInit {

  constructor() { }

  createLog(name){
    console.log(name);
  }
  captureForm(form){
    console.log(form);
  }

  ngOnInit() {
  }

}
