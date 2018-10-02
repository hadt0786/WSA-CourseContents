import { Component } from '@angular/core';
import { AngularFirestore } from 'angularfire2/firestore';
import { Observable } from 'rxjs';
import { AngularFirestoreCollection } from 'angularfire2/firestore';
import { AngularFirestoreDocument } from 'angularfire2/firestore';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'app';

  itemsCollection: AngularFirestoreCollection<Item>;
  itemDocument: AngularFirestoreDocument<Item>;
  items: Observable<Item[]>;

  myCoursename = "Default value";
  myCourseduration = "Default value";

  newCourse: Item = { coursename: "NewCourse", duration: "6 months" };
  updatedCourse: Item = { coursename: "Arduino UNO", duration: "4 months" };


  constructor(public db: AngularFirestore) {
    this.items = this.db.collection('courses').valueChanges();
    this.items.subscribe(items => { console.log(items); });

    this.itemsCollection = this.db.collection('courses');
  }

  fbAddCourses() {
    console.log("Addition called");
    this.itemsCollection.add(this.newCourse);
  }

  fdDeleteCourses() {
    this.itemDocument = this.db.doc(`courses/9999`);
    this.itemDocument.delete();
  }

  fdUpdateCourse() {
    this.itemDocument = this.db.doc(`courses/9999`);
    this.itemDocument.update(this.updatedCourse);
  }

  firebaseAddCourse() {
    const documentId = this.db.createId();
    this.itemsCollection.doc(documentId).set({ coursename: this.myCoursename, duration: this.myCourseduration, id: documentId });
  }
  firebaseDeleteCourse(delCourse: Item) {
    console.log("Delete Pressed");
    this.itemDocument = this.db.doc(`courses/${delCourse.id}`);
    this.itemDocument.delete();
  }
}
interface Item {
  coursename?: string;
  duration?: string;
  id?: string;
}
