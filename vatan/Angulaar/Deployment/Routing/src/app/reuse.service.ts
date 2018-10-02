import { Http } from '@angular/http';


export class ReuseService {


  constructor(public myhttp:Http,public myURL:any) { }

  getPosts(){
    return this.myhttp.get(this.myURL);
  }
}
