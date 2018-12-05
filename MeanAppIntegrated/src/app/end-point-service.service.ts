import { Http } from "@angular/http";
import { Injectable } from "@angular/core";
import { Headers, RequestOptions } from "@angular/http";

@Injectable({
  providedIn: "root"
})
export class EndPointServiceService {
  // Enable this to get error condition checking
  // private myURL = 'http://jsonxxxxxplaceholder.typicode.com/posts';
  //private myURL = 'http://jsonplaceholder.typicode.com/posts';
  
  
  //private myUrl2 = "http://localhost:5000/api/course"; enable cors in the backend 304 errors
   // cors - npm install cors module , , cors - cross origin requests
   // enable cors in index.js(angular - server/index.js) copy 
  //  // 1-  Enable cors app.use(function(req, res, next()){
  //    res.send("Allow-Control-Allow-Orign", "*");
  //    res.send("Allow-Control-Allow-Orign", "*");
  //  })

   // const cors = require('') 
  //  2 - app.use(cors());
  private myURL = "/api/courses";

  constructor(private myHttp: Http) {}

  getPosts() {
    return this.myHttp.get(this.myURL);
  }

  createPost(userPost) {
    const headers = new Headers({ "Content-Type": "application/json" });
    //let headers =  {headers: new  HttpHeaders({ 'Content-Type': 'application/application/json'})};

    return this.myHttp.post(this.myURL, JSON.stringify(userPost), {
      headers: headers
    });
  }

  updatePost(userPost) {
    return this.myHttp.put(
      this.myURL + "/" + userPost.id,
      JSON.stringify(userPost)
    );
  }

  deletePost(userPost) {
    return this.myHttp.delete(
      this.myURL + "/" + userPost.id,
      JSON.stringify(userPost)
    );
  }
}
