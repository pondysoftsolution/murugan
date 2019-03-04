import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html'

})
export class DashboardComponent implements OnInit {
  userList: any;
  constructor() { }

  ngOnInit() {
    this.userList = JSON.parse(sessionStorage.getItem('userList'));
  }

}
