import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class ListserviceService {
    ItemName = ["pen","Iphone10","levisJeans"];
    ItemCategory = ["stationary","electronics","apparels"];
    ItemPrice = [100,100000,1500];
}
