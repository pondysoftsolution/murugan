import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { map } from 'rxjs/operators';
@Injectable({
  providedIn: 'root'
})
export class UserService {
  public API = '//localhost:8080';
  constructor(private http: HttpClient) { }

  getData() {
     return this.http.get(this.API+'').pipe(map(( res: any ) => res));
     }

     getsave(data) {
      return this.http.post(this.API+'/rest/login',data).pipe(map(( res: any ) => res));
      }
   }
   
