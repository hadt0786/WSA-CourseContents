import { Directive, HostListener, Host, ElementRef } from '@angular/core';

@Directive({
  selector: '[appCustomdirective]'
})
export class CustomdirectiveDirective {

  constructor(private el:ElementRef) { }

  @HostListener('focus') onfocus()
  {
    console.log("Focus called");
  }

  @HostListener('blur') onblur()
  {
    console.log("blur called");

    let userInput:any = this.el.nativeElement.value;
    userInput = userInput.split(" ");
    for(let i=0;i<userInput.length;i++){
      if(/\b(?:a|an|the|under|between|over|on|at)\b/gi.test(userInput[i])){
        userInput[i] = userInput[i];
      }
      else{
        userInput[i]=userInput[i].charAt(0).toUpperCase()+userInput[i].slice(1);
      }
    }
    this.el.nativeElement.value = userInput.join(" ");
  }
}
