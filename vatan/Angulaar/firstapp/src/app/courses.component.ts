import {Component} from "@angular/core";
import { CoursesService } from "./courses.service";

@Component({
    selector: "course",
    template: `<h2>{{title}}</h2>
               <h1>{{courses}}</h1>
    `
    
})

export class courseComponent{
    title = "List of courses";
    courses;
    constructor(service: CoursesService){
        this.courses = service.getCourseList()
    }
}