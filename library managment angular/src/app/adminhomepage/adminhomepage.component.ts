import { Component, OnInit } from '@angular/core';
import { FunctionServiceService } from '../function-service.service';
import { NgForm } from '@angular/forms';
import { format } from 'url';
import { Router } from '@angular/router';

@Component({
  selector: 'app-adminhomepage',
  templateUrl: './adminhomepage.component.html',
  styleUrls: ['./adminhomepage.component.css']
})
export class AdminhomepageComponent implements OnInit {
  myStudent = null;
  show = false;
  display = false;
  booksearch;
  constructor(private serv: FunctionServiceService , private router: Router) { }

  add(bookInfo: NgForm) {
    console.log(bookInfo.value);
    this.serv.addBook(bookInfo.value).subscribe(data => {
      console.log(data);
      bookInfo.reset();
    } , err => {
      console.log(err);

    });
  }
  isLoggedIn(): boolean {
    const userDetails = JSON.parse(localStorage.getItem('userDetails'));
    if (userDetails) {
      return true;
    } else {
      return false;
    }
  }

  logout() {
    localStorage.removeItem('userDetails');
    this.router.navigateByUrl('/adminlogin');
  }

  ngOnInit() {
  }

  showsaerch() {
    this.show = true;
    return this.show;
  }

  displaysaerch() {
    this.display = true;
    return this.display;
  }

  cancel() {
    return this.router.navigateByUrl('/adminhomepage');
  }

  getBook(form){
    console.log(form.value.bid);
    return this.serv.searchbook(form.value.bid).subscribe(data => {
      console.log(data);
      // console.log(data.bookbean);
      // this.booksearch = data.bookbean;
    })
  }
 

}
