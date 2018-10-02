import { CommandComponent } from './command/command.component';
import { CoursesComponent } from './courses.component';


import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { CoursesService } from './courses.service';

@NgModule({
  declarations: [
    AppComponent,
    CommandComponent,
    CoursesComponent
       
  ],
  imports: [
    BrowserModule,

  ],
  providers: [
    CoursesService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
