import { GitService } from './../git.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-github',
  templateUrl: './github.component.html',
  styleUrls: ['./github.component.css']
})
export class GithubComponent implements OnInit {
  myposts: any[];
  constructor(private service : GitService) {

   }

  ngOnInit() {
    this.service.getPosts().subscribe(
      response =>{
        console.log(response.json());
        this.myposts = response.json();
      },
      error =>{
        if (error.status == 404)
        alert ("Page Not Fond");
        else {
         alert("Unexpected Error");
         console.log(error);
       }
      }

    )
  }

}
