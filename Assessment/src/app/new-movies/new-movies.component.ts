import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators, NgModel } from '@angular/forms';


@Component({
  selector: 'app-new-movies',
  templateUrl: './new-movies.component.html',
  styleUrls: ['./new-movies.component.css']
})
export class NewMoviesComponent implements OnInit {
  get Amov() {
    return this.form.get('Amov');
  }
  get Atit() {
    return this.form.get('Atit');
  }
  get img() {
    return this.form.get('img');
  }
  get txt() {
    return this.form.get('txt');
  }
  constructor() { }
  form = new FormGroup({
    Amov : new FormControl ('', [Validators.required ]),
    Atit : new FormControl('', [Validators.required]),
    img : new FormControl('', [Validators.required]),
    txt : new FormControl('', [Validators.required])
    
  } )

  ngOnInit() {
  }
  logindata(form : NgModel){
    console.log(form.value);
  }
}