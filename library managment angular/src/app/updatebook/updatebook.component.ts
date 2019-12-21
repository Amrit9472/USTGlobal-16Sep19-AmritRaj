import { Component, OnInit } from '@angular/core';
import { FunctionServiceService } from '../function-service.service';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-updatebook',
  templateUrl: './updatebook.component.html',
  styleUrls: ['./updatebook.component.css']
})
export class UpdatebookComponent implements OnInit {

  constructor(private service : FunctionServiceService) { }
msg;
  ngOnInit() {
  }
 
  update(form){
    
    return this.service.updatebook(form.value.bid,form.value.bname,form.value.bauthor,form.value.publication).subscribe(data  =>{
      console.log(data);
      if(data && data.message==='success'){
      console.log("Update Successfullt")
      this.msg = "Update Successfull";
      } else{
        this.msg='update failure';
      }
    })
  }

}
