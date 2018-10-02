import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-cuspipe',
  templateUrl: './cuspipe.component.html',
  styleUrls: ['./cuspipe.component.css']
})
export class CuspipeComponent implements OnInit {
 par = "this is the paragraph to check the custom pipe. this is the paragraph yo check the custom pipe. this is the paragraph yo check the custom pipe.";
  constructor() { }

  ngOnInit() {
  }

}
