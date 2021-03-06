import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class FunctionServiceService {

  constructor(private http: HttpClient) { }

  getBook(bid): Observable<any> {
    return this.http.get<any>(`http://localhost:8080/lms/searchbook?bid=${bid}`);
  }

  addBook(bookInfo): Observable<any> {
    return this.http.post('http://localhost:8080/lms/addbook' , bookInfo);
  }

  searchStudent(rollno): Observable<any> {
    return this.http.get<any>(`http://localhost:8080/lms/searchstudent?rollno=${rollno}`);
  }
  updatebook(bid: number, bname: string, bauthor: string, publication: string){
    return this.http.put<any>(`http://localhost:8080/lms//updatebook?id=${bid}&bname=${bname}&bauthor=${bauthor}&publication=${publication}`, 1);
  }
  searchbook(bid : number){
    return this.http.get(`http://localhost:8080/lms/searchbook?bid=${bid}`);
  }
}
