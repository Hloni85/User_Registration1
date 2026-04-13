# User Registration and Login System (Java - NetBeans)

## Project Overview

This is a console-based Java application developed using NetBeans. The system allows users to register by entering personal details and validates their credentials before allowing login.

The application demonstrates core programming concepts such as input validation, loops, condition checking, and object-oriented programming.

## Features

* User registration with validation rules
* Username format validation
* Password complexity validation
* South African cellphone number validation
* Login authentication system
* Personalized login welcome message

## Technologies Used

* Java (JDK 8 or higher)
* NetBeans IDE
* JUnit 5 (for testing setup)

## Project Structure

```
com.mycompany.user_registration1/
│
├── Login.java                # Handles validation and authentication logic
├── User_Registration1.java  # Main class (application entry point)
└── testClass.java           # JUnit test class
```

## Validation Rules

### Username Requirements

* Must contain an underscore (_)
* Must not exceed 5 characters

### Password Requirements

* Minimum of 8 characters
* Must contain at least:

  * One uppercase letter
  * One number
  * One special character

### Cellphone Number Requirements

* Must follow South African international format
* Must start with +27
* Must be followed by 9 digits
* Example: +27831234567

## How the Application Works

1. User enters first name and last name
2. User registers with:

   * Username
   * Password
   * Cellphone number
3. System validates all inputs
4. If inputs are valid, registration is completed
5. User is prompted to log in
6. System checks login credentials
7. A success or failure message is displayed

## How to Run the Project

### Using NetBeans

1. Open NetBeans IDE
2. Click File → Open Project
3. Select the project folder
4. Run the project (F6)

### Using Command Line

1. Navigate to the project directory
2. Compile the project:

   ```
   javac com/mycompany/user_registration1/*.java
   ```
3. Run the application:

   ```
   java com.mycompany.user_registration1.User_Registration1
   ```

## Testing

* A JUnit test class is included (testClass.java)
* Currently contains no implemented test methods
* Can be extended to test validation and login functionality

## Known Limitations

* Data is not stored permanently (no database or file storage)
* Only supports one user per session
* No graphical user interface (console-based only)

## Future Improvements

* Add database integration for persistent storage
* Implement graphical user interface (GUI)
* Improve username length flexibility
* Add multiple user support
* Implement password encryption

## Author

Student / tshun

## License

This project is for educational purposes and can be modified or extended as needed.
