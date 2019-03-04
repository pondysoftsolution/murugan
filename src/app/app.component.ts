import {Component, OnChanges,OnInit, DoCheck, AfterContentInit, AfterContentChecked, AfterViewInit, AfterViewChecked, OnDestroy,
  HostListener
} from '@angular/core';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';
import { AuthGuard } from './auth.guard';
declare var $: any;
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
})
export class AppComponent implements OnInit {
  title = 'Angular';
  user = { "userName": "", "password": "" };

  constructor(private router: Router, private auth: AuthGuard) {

  }

  ngOnInit() {

  }
}
