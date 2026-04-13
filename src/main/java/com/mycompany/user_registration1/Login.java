/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.user_registration1;

/**
 *
 * @author Student
 */
class Login {
    
private String username;
    private String password;
    private String cellPhoneNumber;
    private String firstName;
    private String lastName;

    public void setUserNames(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public boolean checkUserName(String username) {
        if (username.contains("_") && username.length() <= 5) {
            this.username = username;
            return true;
        }
        return false;
    }

    public boolean checkPasswordComplexity(String password) {
        String pattern = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[^a-zA-Z0-9]).{8,}$";
        if (password.matches(pattern)) {
            this.password = password;
            return true;
        }
        return false;
    }

    public boolean checkCellPhoneNumber(String number) {
        
        String pattern = "^\\+27\\d{9}$";
        if (number.matches(pattern)) {
            this.cellPhoneNumber = number;
            return true;
        }
        return false;
    }

    public String registerUser(String username, String password, String cellPhonenumber) {
        boolean validUsername = checkUserName(username);
        boolean validPassword = checkPasswordComplexity(password);
        boolean validPhone = checkCellPhoneNumber(cellPhonenumber);

        StringBuilder response = new StringBuilder();

        if (!validUsername)
            response.append("Username is not correctly formatted, please ensure that your username contains an underscore and is no more than five characters in length.\n");

        if (!validPassword)
            response.append("Password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.\n");

        if (!validPhone)
            response.append("Cell phone number incorrectly formatted or does not contain international code.\n");

        if (validUsername && validPassword && validPhone)
            return "User successfully registered.";

        return response.toString();
    }

    public boolean loginUser(String username, String password) {
        return this.username != null && this.password != null &&
               this.username.equals(username) && this.password.equals(password);
    }

    public String returnLoginStatus(boolean loginStatus) {
        if (loginStatus) {
            return "Welcome " + this.firstName + ", " + this.lastName + " it is great to see you again.";
            
        } else {
            
            return "Username or password incorrect, please try again.";
        }
        
    }
    
}

