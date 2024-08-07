import { Component } from '@angular/core';
import { RegistrationService } from 'src/app/service/registration.service';


@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent {
  registrationData = {
    id: null,
    firstName: '',
    lastName: '',
    userEmail: '',
    username: '',
    userAge: null,
    gender: 'F', // Default value
    userpwd: '',
    city: ''
  };
  successMessage: string = ''; 
  errorMessage: string = '';

  constructor(private registrationService: RegistrationService) {}

  submitRegistration() {
    this.errorMessage = ''; // Clear previous error message
    this.registrationService.register(this.registrationData)
      .subscribe(
        Response => {
          console.log('Registration successful', Response);
          this.successMessage = 'Registration successful!';
          // Optionally, navigate to a different page or display a success message
        },
        error => {
          console.error('Registration error:', error);
          this.errorMessage = error.message || 'Registration failed. Please try again.';
        }
      );
  }
}
