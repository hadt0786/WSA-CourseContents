import { Component, OnInit } from '@angular/core';
import { Http } from '@angular/http';

@Component({
  selector: 'app-httpqw',
  templateUrl: './httpqw.component.html',
  styleUrls: ['./httpqw.component.css']
})
export class HttpqwComponent implements OnInit {

  myPosts: any[];
  private myURL ='https://jsonplaceholder.typicode.com/posts';
  constructor(private myHttp: Http) { 
    myHttp.get(this.myURL).subscribe(response =>{
      console.log(response.json());
      this.myPosts = response.json();                                               
    })
  }

    //Method for creating new post

    createNewPost(userTitle: HTMLInputElement){
      let newPost = { title:userTitle.value};
      console.log("Create Post function");

      this.myHttp.post(this.myURL,JSON.stringify(newPost)).subscribe (response =>{
        console.log(response.json());
        this.myPosts.splice(0,0,newPost);
      })
    }

    //Method for update an existing post
    updateExistingPost(updatePost){
      console.log("Update post function -->" + updatePost.id);

      this.myHttp.put(this.myURL + '/' + updatePost.id ,JSON.stringify(updatePost)).subscribe (response =>
      {
        console.log(response.json());
      });
    }

    //Method for delete an existing post

    deleteExistingPost (deletePost){

      console.log("Delete post function -->" + deletePost.id);

      this.myHttp.delete(this.myURL + '/' + deletePost.id).subscribe (response =>
      {
        console.log("Post Deleted Successfully");
        let dPostIndex = this.myPosts.indexOf(deletePost);
        this.myPosts.splice(dPostIndex,1);
      })
    }
  

  ngOnInit() {
  }

}
