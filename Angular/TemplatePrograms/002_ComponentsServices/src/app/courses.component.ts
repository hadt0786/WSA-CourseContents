
// Import a service 
import { CoursesService } from './courses.service';

// Inorder for you to include your class into Angular, you need to use this decorator 
import  { Component } from '@angular/core'

// Selector is a custom HTML tag, template has the corresponding HTML code (Template)

@Component({
    selector: 'courses',
    // template: '<h2>My list of courses</h2>'
    template: `
        <h2> {{title}}</h2>
        <ul> {{courses}}</ul> 
        `
})

export class CoursesComponent {
    title = 'List of courses in WSA:';

    courses; 
    
    constructor (service: CoursesService)
    {
        this.courses = service.getCourseList();
    }
}