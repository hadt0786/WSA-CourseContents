import { HttpModule } from '@angular/http';
import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { HttpqwComponent } from './httpqw/httpqw.component';
import { MDBBootstrapModule } from '../angular-bootstrap-md';
import { HttpnewComponent } from './httpnew/httpnew.component';
import { EndPointService } from './end-point.service';

@NgModule({
  declarations: [
    AppComponent,
    HttpqwComponent,
    HttpnewComponent
  ],
  imports: [
    BrowserModule,
    HttpModule,
    MDBBootstrapModule.forRoot()
  ],
  providers: [
    EndPointService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
