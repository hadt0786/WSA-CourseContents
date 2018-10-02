import {Pipe, PipeTransform} from '@angular/core';

@Pipe({
    name:'summarypipe'
})
export class Summarypipe implements PipeTransform{
    transform(value:string, arg?:number):any{
        if(!value)
        return null;

        return value.substr(0,30) + '...';
    }
}