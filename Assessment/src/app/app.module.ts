import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { RouterModule } from '@angular/router';
import { NewMoviesComponent } from './new-movies/new-movies.component';
import { LoginComponent } from './login/login.component';
import {ReactiveFormsModule, FormsModule} from '@angular/forms';
import { MovComponent } from './mov/mov.component';
import {HttpClientModule} from '@angular/common/http'

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    NewMoviesComponent,
    LoginComponent,
    MovComponent,
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    ReactiveFormsModule,
    RouterModule.forRoot([
      { path : 'addmovies', component : MovComponent},
      {path : 'newmovies', component: NewMoviesComponent},
      {path : 'login',component:LoginComponent},
      
    
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
