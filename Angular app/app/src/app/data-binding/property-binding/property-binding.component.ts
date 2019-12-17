import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-property-binding',
  templateUrl: './property-binding.component.html',
  styleUrls: ['./property-binding.component.css']
})
export class PropertyBindingComponent implements OnInit {

  name = 'John';
  imgUrl = 'https://cdn.pixabay.com/photo/2019/09/01/12/59/traffic-4445171__340.jpg';
  address = 'ram Raj Nagar,Aurangabad';
  colorName  : 'red';
  isActive: boolean = false;
  colspanValue = 2;
  constructor() {
   
  }
   

  ngOnInit() {
    setInterval(()=>{
      this.colorName ='red';
      this.isActive = !this.isActive;
    },2000);
  
  }

}
