import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppComponent } from './app.component';
import { GithubComponent } from './github/github.component';
import { HttpModule } from '@angular/http';
import { GitService } from './git.service';
@NgModule({
  declarations: [
    AppComponent,
    GithubComponent
  ],
  imports: [
    BrowserModule,
    HttpModule
  ],
  providers: [GitService],
  bootstrap: [AppComponent]
})
export class AppModule { }
