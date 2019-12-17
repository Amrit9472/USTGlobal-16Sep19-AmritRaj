import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
    selector : 'app-help',
    templateUrl : './help.component.html',
    styleUrls : ['help.component.css']
})
export class HelpComponent {
    news;
    constructor(private http: HttpClient) {
        this.getNews();
  }
    getNews() {
        this.http.get<any>('https://newsapi.org/v2/top-headlines?country=us&apiKey=25911f73c90c42a799e099363c6ca772').subscribe(data=>{
           this.news = data.articles;
        }, err => {
            console.log(err);
        }, ( ) => {
            console.log("news got successfully");
        })
    }
}
