import { Component, OnInit, ElementRef } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Router, ActivatedRoute} from '@angular/router'
import { SharedService } from '../shared.service';

@Component({
  selector: 'app-login-view',
  templateUrl: './login-view.component.html',
  styleUrls: ['./login-view.component.css']
})
export class LoginViewComponent implements OnInit {

  errorMessage = 'Invalid Credentials';
  invalidLogin = false;
  login='';
  pwd='';
  constructor(private router : Router, private route :ActivatedRoute) { }

  ngOnInit() {
  }

  handleLogin() {
    var strongRegex = new RegExp("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#\$%\^&\*])(?=.{8,})");
    if(this.login.length < 5 || !strongRegex.test(this.pwd)){
      this.invalidLogin =true;
    }else{
      this.invalidLogin =false;
      this.router.navigate(['exchange-rates']);
    }
  }

}
