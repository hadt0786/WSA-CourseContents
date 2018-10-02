import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { BindingComponent } from './binding/binding.component';
import { EventbindingComponent } from './eventbinding/eventbinding.component';
import { PipesComponent } from './pipes/pipes.component';
import { CuspipeComponent } from './cuspipe/cuspipe.component';
import { Summarypipe } from './cuspipe/summarypipe.pipe';x
import { ZodiacPipe } from './zodiac.pipe';

@NgModule({
  declarations: [
    AppComponent,
    BindingComponent,
    EventbindingComponent,
    PipesComponent,
    CuspipeComponent,
    Summarypipe,
    ZodiacPipe,
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
