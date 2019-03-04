import { Component, OnInit } from '@angular/core';
import { UserDetails } from '../user-details';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {
  confirmPassword: string;
  user = new UserDetails();
  sexList = [{ id: '1', desc: 'Male' }, { id: '2', desc: 'FeMale' }];

  userList = Array<UserDetails>();
  constructor() { }

  ngOnInit() {
  }

  sex(event) {
    const newVal = event.target.value;
    this.user.sex = newVal;
  }

  save() {
    this.userList.push(this.user);
    sessionStorage.setItem('userList', JSON.stringify(this.userList));
    console.log(this.userList);
  }

  clear() {
    this.user = new UserDetails();
  }

}
