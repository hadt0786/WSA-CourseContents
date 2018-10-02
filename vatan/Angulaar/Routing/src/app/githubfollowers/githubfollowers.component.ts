import { ActivatedRoute } from '@angular/router';
import { Component, OnInit } from '@angular/core';
import { GitService } from './../git.service';

@Component({
  selector: 'app-githubfollowers',
  templateUrl: './githubfollowers.component.html',
  styleUrls: ['./githubfollowers.component.css']
})
export class GithubfollowersComponent implements OnInit {
  myposts: any[];
  constructor(private route:ActivatedRoute,private service : GitService) {

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
    //Method to demonstrate getting query parameters from the view
    this.route.queryParamMap.subscribe(params =>{
      console.log("The optional parameters are " , params);

      let pageNumber = params.get('page');
      let sortOrder = params.get('order');

      console.log("The actual values " + pageNumber + " " + sortOrder);
    });
  }

}