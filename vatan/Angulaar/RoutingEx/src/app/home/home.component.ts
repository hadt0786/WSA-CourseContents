import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
  arr = [{Month: 1, Year: 2018},{Month: 2, Year: 2018},{Month: 3, Year: 2018}];
  constructor() { }

  ngOnInit() {
  }

}
