import { BrowserModule } from '@angular/platform-browser';
import { RouterModule } from '@angular/router';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { NavbarComponent } from './navbar/navbar.component';
import { HomeComponent } from './home/home.component';
import { GithubprofileComponent } from './githubprofile/githubprofile.component';
import { GithubfollowersComponent } from './githubfollowers/githubfollowers.component';
import { NotfoundComponent } from './notfound/notfound.component';
import { PostsComponent } from './posts/posts.component';
import { HttpModule } from '@angular/http';
import { GithubserviceService } from './githubservice.service';

@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    HomeComponent,
    GithubprofileComponent,
    GithubfollowersComponent,
    NotfoundComponent,
    PostsComponent
  ],
  imports: [
    BrowserModule,
    HttpModule,
    RouterModule.forRoot([
      { 
        path: '', 
        component: HomeComponent
      },
      { 
        path: 'followers/:id',
        component: GithubprofileComponent
      },
      { 
        path: 'followers',
        component: GithubfollowersComponent
      },
      { 
        path: 'posts',
        component: PostsComponent
      },
      { 
        path: '**',
        component: NotfoundComponent
      },


    ])
  ],
  providers: [
    GithubserviceService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
