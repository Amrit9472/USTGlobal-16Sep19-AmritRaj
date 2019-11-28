import { Component, OnInit, DoCheck, AfterViewInit, AfterContentChecked, OnDestroy } from '@angular/core';
import { NgForm } from '@angular/forms';
import { UserService } from '../user.service';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit, DoCheck ,AfterViewInit,AfterContentChecked,OnDestroy{
  
   
  users;
  selectedUser;
  today = new Date();
  constructor(private service : UserService) { 
    console.log("constructor is excuted");
    this.getData();
  }

  ngOnInit() {
    console.log ("ngoninit is excuted");
  }
  ngDoCheck(){
    console.log("ngDOcheck is excuted");
  }
  ngAfterViewInit(){
    console.log("ng AfterViewInit is excuted");
  }
  ngAfterContentChecked(){
    console.log("ngAfterViewChecked is excuted");
  }
  ngOnDestroy(){
    console.log("ngOnDestroy is excuted");
  }


  
  loginData(form: NgForm){
    console.log(form.value);
    this.service.postUser(form.value).subscribe(data => {
      console.log(data);
      this.getData();
    } ,err =>{
      console.log(err);
    },() =>{
      console.log('data posted successfully');
    })
  }
  getData(){
    this.service.getUser().subscribe(data =>{
      console.log(data);
      this.users =data;
    }, err => {
      console.log(err);
    }, () => {
      console.log('data got successfully');
    })
  }
  delteData(user){
    console.log(user);
    this.service.deleteUser(user.id).subscribe(data =>{
      console.log(data);
      this.getData();
    },err =>{
      console.log(err);

    },() =>{
      console.log("data deleted succesfully");
    })
  }
  selectUser(user){
    console.log(user);
    this.selectedUser = user;
  }
  updateData(form){
    console.log(form.value);
    this.service.updateUser(form.value.id , form.value).subscribe(data =>{
      console.log(data);
    },err =>{
      console.log(err);
    },()=>{
      console.log("data updated successfully");
    })
  }
}
