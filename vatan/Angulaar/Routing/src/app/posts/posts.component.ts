import { Subscription } from 'rxjs';
import { EndPointService } from './../end-point.service';
import { Component, OnInit } from '@angular/core';
import { Http } from '@angular/http';

@Component({
  selector: 'app-posts',
  templateUrl: './posts.component.html',
  styleUrls: ['./posts.component.css']
})
export class PostsComponent implements OnInit {
  myPosts: any[];
  constructor(private service:EndPointService){
  }
  ngOnInit() {
    //Bydefault populate all posts...
    this.service.getPosts().subscribe( 
    response =>
    {
      console.log(response.json());
      this.myPosts = response.json();
    },
    error =>{
        if (error.status == 404)
         alert ("Page Not Fond");
        else {
          alert("Unexpected Error");
          console.log(error);
        }
    });
  }

  createNewPost(userTitle){
        let newPost = { title:userTitle.value};
        this.service.createPost(newPost).subscribe (
        response =>{
            console.log(response.json());
            this.myPosts.splice(0,0,newPost);
        },
        error =>{
          if (error.status == 404)
           alert ("Post Not Found");
          else {
            alert("Unexpected Error");
            console.log(error);
          }
      })
      }

  updateExistingPost(updatePost){  
        this.service.updatePost(updatePost).subscribe (
        response =>
          {
            console.log(response.json());
          },
        error =>{
            if (error.status == 404)
             alert ("Post Not Found");
            else {
              alert("Unexpected Error");
              console.log(error);
            }
        });  
      }

      deleteExistingPost (deletePost){

            console.log("Delete post function -->" + deletePost.id);
      
            this.service.deletePost(deletePost).subscribe (
            response =>
              {
                let dPostIndex = this.myPosts.indexOf(deletePost);
                this.myPosts.splice(dPostIndex,1);
              },
              error =>{
                if (error.status == 404)
                 alert ("Post Not Found");
                else {
                  alert("Unexpected Error");
                  console.log(error);
                }
            })
          } 
}
