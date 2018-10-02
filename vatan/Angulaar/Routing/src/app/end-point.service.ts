import { Http } from '@angular/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class EndPointService {

  private myURL = 'http://jsonplaceholder.typicode.com/posts';
  constructor(private myhttp :Http) {

   }

   getPosts(){
     return this.myhttp.get(this.myURL);
   }

   createPost(userPost){
     return this.myhttp.post(this.myURL,JSON.stringify(userPost));
   }
   updatePost(userPost){
    return this.myhttp.put(this.myURL + '/' + userPost.id,JSON.stringify(userPost));
  }
  deletePost(userPost){
    return this.myhttp.delete(this.myURL + '/' + userPost.id,JSON.stringify(userPost));
  }
}
