import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'zodiac'
})
export class ZodiacPipe implements PipeTransform {
arr = [];
  transform(value: string, args?: any): any {
    if(!value)
    return null;

    this.arr = value.split(",");
    this.arr=this.arr[3].split("/");
    
    if((this.arr[0]>=21 && this.arr[1]== "03") || (this.arr[0]<=19 && this.arr[1]== "04" )){
      return  this.arr +" = Aries";
    }
    else if((this.arr[0]>=20 && this.arr[1]=="04") || (this.arr[0]<=20 && this.arr[1]=="05" )){
      return  this.arr +" = Taurus";
    }
    else if((this.arr[0]>=21 && this.arr[1]=="05") || (this.arr[0]<=20 && this.arr[1]=="06" )){
      return  this.arr +" = Gemini";
    }
    else if((this.arr[0]>=21 && this.arr[1]=="06") || (this.arr[0]<=22 && this.arr[1]=="07" )){
      return  this.arr +" = Cancer";
    }
    else if((this.arr[0]>=23 && this.arr[1]=="07") || (this.arr[0]<=22 && this.arr[1]=="08" )){
      return  this.arr +" = Leo";
    }
    else if((this.arr[0]>=23 && this.arr[1]=="08") || (this.arr[0]<=23 && this.arr[1]=="09" )){
      return  this.arr +" = Virgo";
    }
    else if((this.arr[0]>=24 && this.arr[1]=="09") || (this.arr[0]<=23 && this.arr[1]=="10" )){
      return  this.arr +" = Libra";
    }
    else if((this.arr[0]>=24 && this.arr[1]=="10") || (this.arr[0]<=22 && this.arr[1]=="11" )){
      return  this.arr +" = Scorpio";
    }
    else if((this.arr[0]>=23 && this.arr[1]=="11") || (this.arr[0]<=22 && this.arr[1]=="12" )){
      return  this.arr +" = Sagittarius";
    }
    else if((this.arr[0]>=23 && this.arr[1]=="12") || (this.arr[0]<=20 && this.arr[1]=="01" )){
      return  this.arr +" = Capricon";
    }
    else if((this.arr[0]>=21 && this.arr[1]=="01") || (this.arr[0]<=18 && this.arr[1]=="02" )){
      return  this.arr +" = Aquarius";
    }
    else if((this.arr[0]>=19 && this.arr[1]=="02") || (this.arr[0]<=20 && this.arr[1]=="03" )){
      return  this.arr +" = Aries";
    }
    }
  }
