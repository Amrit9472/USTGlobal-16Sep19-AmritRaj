import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { FunctionServiceService } from '../function-service.service';

@Component({
  selector: 'app-search',
  templateUrl: './search.component.html',
  styleUrls: ['./search.component.css']
})
export class SearchComponent implements OnInit {
  myStudent = null;
  constructor(private serv: FunctionServiceService) { }

  ngOnInit() {
  }
  getStudent(form: NgForm) {
    console.log(form.value);
    this.serv.searchStudent(form.value.rollno).subscribe(data => {
      console.log(data);
      this.myStudent = data.sb;
      form.reset();
    }, err => {
      console.log(err);
    });
  }
}
