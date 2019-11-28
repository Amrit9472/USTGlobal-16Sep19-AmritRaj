import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-parent',
  templateUrl: './parent.component.html',
  styleUrls: ['./parent.component.css']
})
export class ParentComponent implements OnInit {
  selectedCar;
   Cars =[
     {
       name : 'Audi',
       imgUrl : 'https://cdn.pixabay.com/photo/2014/06/04/16/36/car-repair-362150_960_720.jpg'
     },
      
     {
      name : 'lamborgini',
      imgUrl : 'https://cdn.pixabay.com/photo/2012/05/29/00/43/car-49278_960_720.jpg'
     },
    
     {
    name : 'BMW',
    imgUrl : 'https://cdn.pixabay.com/photo/2019/07/07/14/03/fiat-4322521_960_720.jpg'
    },
    
    {
   name : 'Auto',
   imgUrl : 'https://cdn.pixabay.com/photo/2013/07/13/11/36/volkswagen-158463_960_720.png'
   },

   ]

  constructor() { }

  ngOnInit() {
  }
  sendCar(car){
    console.log(car);
    this. selectedCar=car;
  }
}
