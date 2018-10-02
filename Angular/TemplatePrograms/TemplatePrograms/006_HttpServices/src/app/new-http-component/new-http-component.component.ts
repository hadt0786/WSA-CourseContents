import { EndPointServiceService } from './../end-point-service.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-new-http-component',
  templateUrl: './new-http-component.component.html',
  styleUrls: ['./new-http-component.component.css']
})
export class NewHttpComponentComponent implements OnInit {

    myPosts: any[];
  

  constructor(private service: EndPointServiceService) {

  }

  ngOnInit() {

    // By default populate all posts....
    this.service.getPosts().subscribe(response => {
      console.log(response.json());
      this.myPosts = response.json();
    });

  }

   // Method for creating a new post
   createNewPost(userTitle: HTMLInputElement) {

    let newPost = { title: userTitle.value };

    this.service.createPost(newPost).subscribe (response => {
      console.log(response.json());
      this.myPosts.splice(0,0,newPost);
    });    

   }

   // Method for updating an existing post 
   updateExistingPost (uPost){

    this.service.updatePost(uPost).subscribe (response => {

      console.log(response.json());
   
    });

    }
    // Method for deleting an existing post 

    deleteExistingPost (dPost){

      this.service.deletePost(dPost).subscribe (response => 
        {
          console.log("Post deleted successfully");
          let dPostIndex = this.myPosts.indexOf(dPost);
          this.myPosts.splice(dPostIndex,1);
        });
    }



  

}
