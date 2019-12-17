import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-ng-for',
  templateUrl: './ng-for.component.html',
  styleUrls: ['./ng-for.component.css']
})
export class NgForComponent implements OnInit {
  products =[
    { img :'https://cdn.pixabay.com/photo/2013/03/19/18/23/utah-95032_960_720.jpg',
      name :'bike',
      price : 60000,

    },
      { 
     img : 'https://cdn.pixabay.com/photo/2014/05/23/23/17/dessert-352475_960_720.jpg',
     name : 'cake',
     price  : 60,

     },
     { 
      img : 'https://image.shutterstock.com/image-photo/cake-chocolate-600w-293217344.jpg',
      name : 'choco cake',
      price  : 80,
 
      },
      { 
        img :'https://cdn.pixabay.com/photo/2019/09/27/09/39/melons-4507974_960_720.jpg',
        name : 'coconut',
        price  : 25,
   
        }
  ]

  constructor() { }

  ngOnInit() {
  }

}
