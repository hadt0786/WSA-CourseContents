import { BrowserModule } from '@angular/platform-browser';
import { NgModule, Component } from '@angular/core';

import { AppComponent } from './app.component';
import { NavbarComponent } from './navbar/navbar.component';
import { GithubfollowersComponent } from './githubfollowers/githubfollowers.component';
import { HomeComponent } from './home/home.component';
import { NotfoundComponent } from './notfound/notfound.component';
import { PostsComponent } from './posts/posts.component';
import { RouterModule } from '@angular/router'; 
import { HttpModule } from '@angular/http';
import { GithubprofileComponent } from './githubprofile/githubprofile.component';
@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    GithubfollowersComponent,
    HomeComponent,
    NotfoundComponent,
    PostsComponent,
    GithubprofileComponent
  ],
  imports: [
    BrowserModule,
    HttpModule,
    RouterModule.forRoot([{
      path: '',
      component: HomeComponent
    },
    {
      path:'followers/:login',
      component: GithubprofileComponent
    },
    {
     path:'followers',
     component: GithubfollowersComponent
    },
    {
      path: 'posts',
      component: PostsComponent
    },
    {
      path: '**',
      component:NotfoundComponent
    },
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
