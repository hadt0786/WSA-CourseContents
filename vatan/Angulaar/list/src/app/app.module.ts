import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { NewlistComponent } from './newlist/newlist.component';
import { ListserviceService } from './listservice.service';

@NgModule({
  declarations: [
    AppComponent,
    NewlistComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [
    ListserviceService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
