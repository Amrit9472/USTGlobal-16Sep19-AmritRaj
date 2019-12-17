import { Component } from '@angular/core';

@Component({
    selector : 'app-home',
    templateUrl : './home.component.html',
    styleUrls : ['./home.component.css']
})
export class HomeComponent {
    color = 'red';
    colorName = 'yellow';
    isActive = false;
    constructor() { 
        setInterval(()=>{
           this.isActive =!this.isActive 
        },2000);
    }
}
