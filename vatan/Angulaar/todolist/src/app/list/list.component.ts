import { Component, OnInit } from '@angular/core';
import { AngularFirestore } from 'angularfire2/firestore';
import { AngularFirestoreCollection } from 'angularfire2/firestore';
import { AngularFirestoreDocument } from 'angularfire2/firestore';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-list',
  templateUrl: './list.component.html',
  styleUrls: ['./list.component.css']
})
export class ListComponent implements OnInit {
  selectedOption = "Default";
  userInput:string="";
  update:string = "";
  newdata:Item = {};
  itemsCollection: AngularFirestoreCollection<Item>;
  itemDocument: AngularFirestoreDocument<Item>;
  items: Observable<Item[]>;
  constructor(public db: AngularFirestore){
    this.items = this.db.collection('data').valueChanges();
    this.items.subscribe( items => { console.log(items); } );

    this.itemsCollection = this.db.collection('data');
    console.log(this.items);
  }
  selectChangeHandler(event:any){
    this.selectedOption = event.target.value;
  }
  AddCourses(){
    const documentId = this.db.createId();
    this.itemsCollection.doc(documentId).set({ category:this.selectedOption,completed:false,date:new Date(),item: this.userInput, id: documentId });
    console.log(this.userInput);
  }
  DeleteCourse(deldata: Item) {
    console.log("Delete Pressed");
    this.itemDocument = this.db.doc(`data/${deldata.id}`);
    this.itemDocument.delete();
  }
  UpdateCourse(Updatedata: Item) {
    this.itemDocument = this.db.doc(`data/${Updatedata.id}`);
    this.itemDocument.update({category:Updatedata.category,completed:Updatedata.completed,date:new Date(),item:this.update,id:Updatedata.id});
  }
 
  ngOnInit() {
  }
}
interface Item{
  category?:string;
  completed?:boolean;
  date?:Date;
  item?:string; 
  id?:string;
 }
