import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
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


const routes: Routes = [
  { path: '', component: HomeComponent },
  { path: 'adminregister', component: AdminRegisterComponent },
  { path: 'adminlogin', component: LoginadminComponent },
  { path: 'studentregistration', component: StudentregisterComponent },
  { path: 'studentlogin', component: StudentloginComponent },
  { path: 'studenthomepage', component: StudenthomepageComponent },
  { path: 'adminhomepage', component: AdminhomepageComponent },
  { path: 'register', component: RegisterComponent },
  { path: 'login', component: LoginComponent },
  {path: 'search', component: SearchComponent},
  {path : 'updatebook',component : UpdatebookComponent}


];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
