import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';
import {UsernameValidators} from '../username.validators';

@Component({
  selector: 'app-reactive-form',
  templateUrl: './reactive-form.component.html',
  styleUrls: ['./reactive-form.component.css']
})
export class ReactiveFormComponent implements OnInit {


  myform = new FormGroup({

    'username': new FormControl('',[
      Validators.required,
      Validators.minLength(3),
      UsernameValidators.cannotContainSpace
    ]),

    'email': new FormControl('',[
      Validators.required,
      Validators.minLength(15),
    ]),

    'password': new FormControl('',[
      Validators.required,
      Validators.minLength(8)
    ])      
  });

  get username(){
    return this.myform.get('username');
  }

  get password(){
    return this.myform.get('password');
  }

  get email(){
    return this.myform.get('email');
  }

  constructor() { }

  ngOnInit() {


  }

}
