import { Component, OnInit } from '@angular/core';
import { Route, Router } from '@angular/router';
import { AuthGuard } from '../auth.guard';
import { NgForm } from '@angular/forms';
import { UserDetails } from '../user-details';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  user = new UserDetails();
  userList: any;
  constructor(private router: Router, private auth: AuthGuard) {

  }

  ngOnInit() {
    this.userList = JSON.parse(sessionStorage.getItem('userList'));
  }

  submit(loginForm: NgForm) {
    if (loginForm.valid) {
      console.log(this.user);
      for (let use of this.userList) {
        if (this.user.userName == use.userName && this.user.password == use.password) {
          console.log(' USER NAME AND PASSWORD IS CORRECT');
          this.auth.status = true;
          this.router.navigate(['dashboard']);
          break;
        } else {
          console.log('Invalid USER NAME AND PASSWORD');
        }
      }
    } else {
      console.log(this.user);
    }
  }
}
