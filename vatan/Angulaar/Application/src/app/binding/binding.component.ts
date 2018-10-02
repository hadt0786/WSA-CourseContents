import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-binding',
  templateUrl: './binding.component.html',
  styleUrls: ['./binding.component.css']
})
export class BindingComponent implements OnInit {
  myAppTitle = "Binding Example";
  bindingMaterials = ["Fevicol","Feviquick","Camelgum"];
  imageLink = "http://www.pidilite.com/wp-content/uploads/2016/08/SIde-image.png";
  myParagraph = "Binding requires binder with fevicol";
  myButtonStatus = true;
  myBackground = "green";
  constructor() { }

  ngOnInit() {
  }

}
