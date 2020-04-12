import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LoginViewComponent } from './login-view/login-view.component';
import { ExchangeRatesComponent } from './exchange-rates/exchange-rates.component';
import { LogoutComponent } from './logout/logout.component';

const routes: Routes = [
  {path : '', redirectTo :'/login',pathMatch:'full'},
  {path : 'login', component: LoginViewComponent},
  {path : 'exchange-rates' , component : ExchangeRatesComponent},
  {path : 'logout' , component : LogoutComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
