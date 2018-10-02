import { Component, OnInit } from '@angular/core';
import { Http } from '@angular/http';

@Component({
  selector: 'app-http',
  templateUrl: './http.component.html',
  styleUrls: ['./http.component.css']
})
export class HttpComponent implements OnInit {

  myPosts: any[];
  private myURL = 'http://jsonplaceholder.typicode.com/posts';

  constructor(private myHttp: Http) {

    // By default populate all posts....
      myHttp.get(this.myURL).subscribe(response => {
      console.log(response.json());
      this.myPosts = response.json();
    });

   }

   // Method for creating a new post

   createNewPost(userTitle: HTMLInputElement) {

    let newPost = { title: userTitle.value };

    console.log("Create post function");

    this.myHttp.post(this.myURL,JSON.stringify(newPost)).subscribe (response => {
      console.log(response.json());
      this.myPosts.splice(0,0,newPost);
    });    

   }

   // Method for updating an existing post 

   updateExistingPost (updatePost){

    console.log("Update post function -->" + updatePost.id);
    
    this.myHttp.put(this.myURL + '/' + updatePost.id ,JSON.stringify(updatePost)).
    subscribe (response => {

      console.log(response.json());
   
    });

    }
    // Method for deleting an existing post 

    deleteExistingPost (deletePost){

      console.log("Delete post function -->" + deletePost.id);

      this.myHttp.delete(this.myURL + '/' + deletePost.id).subscribe (response => 
        {
          console.log("Post deleted successfully");
          let dPostIndex = this.myPosts.indexOf(deletePost);
          this.myPosts.splice(dPostIndex,1);
        });
    }
  

  ngOnInit() {
    
  }

}
