import { Subscription } from 'rxjs';
import { EndPointService } from './../end-point.service';
import { Component, OnInit } from '@angular/core';
import { Http } from '@angular/http';


@Component({
  selector: 'app-httpnew',
  templateUrl: './httpnew.component.html',
  styleUrls: ['./httpnew.component.css']
})
export class HttpnewComponent implements OnInit {
  myPosts: any[];
  // private myURL ='https://jsonplaceholder.typicode.com/posts';
  // constructor(private myHttp: Http) { 
  //   myHttp.get(this.myURL).subscribe(response =>{
  //     console.log(response.json());
  //     this.myPosts = response.json();                                               
  //   })
  // }

  //   //Method for creating new post

  //   createNewPost(userTitle: HTMLInputElement){
  //     let newPost = { title:userTitle.value};
  //     console.log("Create Post function");

  //     this.myHttp.post(this.myURL,JSON.stringify(newPost)).subscribe (response =>{
  //       console.log(response.json());
  //       this.myPosts.splice(0,0,newPost);
  //     })
  //   }

  //   //Method for update an existing post
  //   updateExistingPost(updatePost){
  //     console.log("Update post function -->" + updatePost.id);

  //     this.myHttp.put(this.myURL + '/' + updatePost.id ,JSON.stringify(updatePost)).subscribe (response =>
  //     {
  //       console.log(response.json());
  //     });
  //   }

  //   //Method for delete an existing post

  //   deleteExistingPost (deletePost){

  //     console.log("Delete post function -->" + deletePost.id);

  //     this.myHttp.delete(this.myURL + '/' + deletePost.id).subscribe (response =>
  //     {
  //       console.log("Post Deleted Successfully");
  //       let dPostIndex = this.myPosts.indexOf(deletePost);
  //       this.myPosts.splice(dPostIndex,1);
  //     })
  //   }

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
      
            this.service.deletePost(deletePost + 200).subscribe (
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
