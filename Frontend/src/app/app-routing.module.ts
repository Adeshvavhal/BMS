import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './componds/login/login.component';
import { RegisterComponent } from './componds/register/register.component';
import { NavbarComponent } from './componds/navbar/navbar.component';

const routes: Routes = [
  {path:'',redirectTo:'/login',pathMatch:'full'},
  {path: 'login', component:LoginComponent},
  {path:'register' , component:RegisterComponent},
  {path:'navbar' , component:NavbarComponent},

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
