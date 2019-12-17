import { NgModule, Component } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { AboutComponent } from './about/about.component';
import { HelpComponent } from './help/help.component';
import { LoginComponent } from './login/login.component';
import { PropertyBindingComponent } from './data-binding/property-binding/property-binding.component';
import { EventBindingComponent } from './data-binding/event-binding/event-binding.component';
// import { TwoWayBindingComponent } from './data-binding/two-way-binding/two-way-binding.component';
import { NgIfComponent } from './directive/structural-directive/ng-if/ng-if.component';
import { NgForComponent } from './directive/structural-directive/ng-for/ng-for.component';
import { NgSwitchComponent } from './directive/structural-directive/ng-switch/ng-switch.component';
import { RegisterComponent } from './register/register.component';
import { Form1Component } from './form1/form1.component';
import { Form2Component } from './form2/form2.component';
import { ReactiveFormComponent } from './reactive-form/reactive-form.component';
import { ParentComponent } from './parent/parent.component';
import { CommentDetailsComponent } from './comment-details/comment-details.component';

const routes: Routes = [
  { path: 'home', component: HomeComponent },
  { path: 'about', component: AboutComponent },
  { path: 'help', component: HelpComponent },
  { path: 'login', component: LoginComponent },
  { path: 'propety-binding', component: PropertyBindingComponent },
  { path: 'event-binding', component: EventBindingComponent},
  // { path:  'two_way', component : TwoWayBindingComponent},
  {path: 'ngif', component : NgIfComponent},
  {path : 'ngfor', component : NgForComponent},
  {path : 'ngSwitch', component : NgSwitchComponent},
  {path : 'register', component : RegisterComponent},
  {path : 'form1' , component : Form1Component},
  {path : 'form2' , component : Form2Component},
  {path : 'reactive-from', component : ReactiveFormComponent},
  {path : 'parent', component : ParentComponent},
  {path : 'comment-details' , component : CommentDetailsComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
