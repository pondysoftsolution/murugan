import { Component } from '@angular/core';
import { UserService } from './user.service';
import { User } from './user';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  user = new User();

  userList :any;
  test:any;
  name:any;

  constructor(private userService: UserService) { }
   ngOnInit():any {
   this.onload();
   }
   onload(){
    this.userService.getData().subscribe(data=>{
      this.userList = data.hai;

      if (this.userList) {
        this.test = 'murugan';
      }
      console.log(this.userList)
    });
   }

   save(){
     this.userService.getsave(this.user).subscribe(data=>{
      this.onload();
     });
     
   }
}
