import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { HttpComponent } from './http/http.component';
import { HttpModule } from '@angular/http';
import { NewHttpComponentComponent } from './new-http-component/new-http-component.component';
import { EndPointServiceService } from './end-point-service.service';
import { HttperrorComponent } from './httperror/httperror.component';

@NgModule({
  declarations: [
    AppComponent,
    HttpComponent,
    NewHttpComponentComponent,
    HttperrorComponent
  ],
  imports: [
    BrowserModule,
    HttpModule    
  ],
  providers: [
    EndPointServiceService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
