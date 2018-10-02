import { Http } from '@angular/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class EndPointServiceService {

  // Enable this to get error condition checking 
  // private myURL = 'http://jsonxxxxxplaceholder.typicode.com/posts';
  private myURL = 'http://jsonplaceholder.typicode.com/posts';

  constructor(private myHttp : Http) {

    
   }

  getPosts() {

    return this.myHttp.get(this.myURL);

  }

  createPost(userPost) {

    return this.myHttp.post(this.myURL,JSON.stringify(userPost));

  }

  updatePost(userPost) {

    return this.myHttp.put(this.myURL + '/' + userPost.id,JSON.stringify(userPost));
  
  }

  deletePost(userPost) {

    return this.myHttp.delete(this.myURL + '/' + userPost.id,JSON.stringify(userPost));

  }
}
