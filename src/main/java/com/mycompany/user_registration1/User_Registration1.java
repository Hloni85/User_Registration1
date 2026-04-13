/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.user_registration1;

import java.util.Scanner;


public class User_Registration1{

/**
 *
 * @author tshun
 */
 

public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        Login login = new Login();

        System.out.println("===__------___----"
                + "-- ===");
        System.out.println("Welcome To Registration");
        System.out.println("===___-----___-----___===");
        System.out.println("");
        System.out.print("Enter your first name: ");
        String firstName = sc.nextLine();

        System.out.print("Enter your last name: ");
        String lastName = sc.nextLine();

        login.setUserNames(firstName, lastName);

        // Username
        boolean usernameValid = false;
        String username = " ";
        while (!usernameValid) {
            System.out.print("Enter username (must include '_' and be <= 5 characters): ");
            username = sc.nextLine();
            usernameValid = login.checkUserName(username);
            if (usernameValid) {
                System.out.println("Username successfully captured");
            } else {
                System.out.println("Username is not correctly formatted, please ensure that your username contains an underscore and is no more than five characters in length");
            }
        }

        // Password
        boolean passwordValid = false;
        String password = " ";
        while (!passwordValid) {
            
            System.out.print("Enter password must be (at least 8 characters, a capital letter, number, special character): ");
            password = sc.nextLine();
            passwordValid = login.checkPasswordComplexity(password);
            if (passwordValid) {
                System.out.println("Password is successfully captured");
            } else {
                System.out.println("Password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a number, and a special character");
            }
        }

        // Cell Phone number/National Code
        boolean phoneValid = false;
        String phone = " ";
        while (!phoneValid) {
            System.out.print("Enter SA cellphone number (e.g., +2783***4567): ");
            phone = sc.nextLine();
            phoneValid = login.checkCellPhoneNumber(phone);
            if (phoneValid) {
                System.out.println("Cell phone number successfully added.");
            } else {
                System.out.println("Cell phone number incorrectly formatted or does not contain international code.");
            }
        }
          System.out.println("===___-----___-----___===");
          System.out.println("\nRegistration complete");
          System.out.println("");
         // LOGIN Details prompt
          System.out.println("\nLogin");
          System.out.println("");
          System.out.print("Enter your username: ");
          String loginUsername = sc.nextLine();

           System.out.print("Enter your password: ");
           String loginPassword = sc.nextLine();
           System.out.println("");
           boolean loggedIn = login.loginUser(loginUsername, loginPassword);
           System.out.println(login.returnLoginStatus(loggedIn));
    }
}

   
    

