import { ReuseService } from './reuse.service';
import { Injectable } from '@angular/core';
import { Http } from '@angular/http';

@Injectable({
  providedIn: 'root'
})

export class GitService extends ReuseService {
   myURL = "https://api.github.com/users/devendradora/followers";
 
   constructor(public myhttp:Http) {

    super(myhttp, 'https://api.github.com/users/devendradora/followers');
 
  }
}

