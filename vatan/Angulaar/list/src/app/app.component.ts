import { Component } from '@angular/core';
import {ListserviceService} from "./listservice.service";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'app';
  Name;
  Category;
  Price;
  constructor(service:ListserviceService){
    this.Name=service.ItemName;
    this.Category= service.ItemCategory;
    this.Price = service.ItemPrice;
  }
}
