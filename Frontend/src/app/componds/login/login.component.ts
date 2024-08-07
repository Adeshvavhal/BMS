import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent  {

  username: string = '';
  userpwd: string = '';
  errorMessage: string = '';

  constructor(private http: HttpClient,private router:Router) {}

  login() {
    this.errorMessage = ''; // Clear previous error message
    const loginData = { username: this.username, password: this.userpwd };
    this.http.post<any>('http://localhost:8080/login', loginData)
      .subscribe(
        response => {
          if (response.success) { // Adjust based on your API response
            // Navigate to the dashboard or another page
            this.router.navigate(['/navbar']); // Example route
          } else {
            this.errorMessage = 'Invalid username or password';
          }
        },
        error => {
          // Handle error
          console.error('Login error:', error);
          this.errorMessage = 'Invalid username or password';
        }
      );
  }
  nativeRgister():void{
    this.router.navigate(['/register']);
  }
}
