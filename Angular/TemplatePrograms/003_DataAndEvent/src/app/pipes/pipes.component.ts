import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-pipes',
  templateUrl: './pipes.component.html',
  styleUrls: ['./pipes.component.css']
})
export class PipesComponent implements OnInit {
  state = {sName:"Karnataka",
  sPopulation:62000000,
  sFormation:new Date(1956,12,1),
  sRating:3.9765,
  sCurrency:100,
  sPercentage:0.83,
};
  constructor() { }

  ngOnInit() {
  }

}
