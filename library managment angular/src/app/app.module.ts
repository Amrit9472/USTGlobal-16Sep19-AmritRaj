import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import {HttpClientModule} from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { HomeComponent } from './home/home.component';
import { AdminRegisterComponent } from './admin-register/admin-register.component';
import { LoginadminComponent } from './loginadmin/loginadmin.component';
import { StudentregisterComponent } from './studentregister/studentregister.component';
import { StudentloginComponent } from './studentlogin/studentlogin.component';
import { StudenthomepageComponent } from './studenthomepage/studenthomepage.component';
import { AdminhomepageComponent } from './adminhomepage/adminhomepage.component';
import { RegisterComponent } from './register/register.component';
import { LoginComponent } from './login/login.component';
import { SearchComponent } from './search/search.component';
import { UpdatebookComponent } from './updatebook/updatebook.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    HomeComponent,
    AdminRegisterComponent,
    LoginadminComponent,
    StudentregisterComponent,
    StudentloginComponent,
    StudenthomepageComponent,
    AdminhomepageComponent,
    RegisterComponent,
    LoginComponent,
    SearchComponent,
    UpdatebookComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
