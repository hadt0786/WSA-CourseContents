import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { courseComponent} from "./courses.component";
import { AppComponent } from './app.component';
import { VatanComponent } from './vatan/vatan.component';
import { CoursesService } from './courses.service';

@NgModule({
  declarations: [
    AppComponent,
    courseComponent,
    VatanComponent,
  ],
  imports: [
    BrowserModule
  ],
  providers: [
    CoursesService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
