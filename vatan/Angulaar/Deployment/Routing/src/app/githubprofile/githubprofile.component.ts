import { Http } from '@angular/http';
import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';


@Component({
  selector: 'app-githubprofile',
  templateUrl: './githubprofile.component.html',
  styleUrls: ['./githubprofile.component.css']
})
export class GithubprofileComponent implements OnInit {
  constructor(private route: ActivatedRoute,private myHttp: Http) { }
  private myUrl = "https://api.github.com/users/";
  myPosts;
  ngOnInit() {
    this.route.paramMap.subscribe(params =>{
      console.log(params);
      let login = params.get('login');
      this.myUrl = "https://api.github.com/users" + "/" + login;
    });
    this.myHttp.get(this.myUrl).subscribe(response =>{
      this.myPosts = response.json();
      console.log(this.myPosts);
    })
  }
}
