package com.Learntocode;

import java.util.Scanner;

public class fullnamegenerator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please Enter Your First Name: ");
        String firstName = input.nextLine();

        System.out.print("Please Enter Your Middle Name: ");
        String middleName = input.nextLine();

        System.out.print("Please Enter Your Last Name: ");
        String lastName = input.nextLine();

        String fullName = firstName + middleName + lastName;
        System.out.println("Your Full Name is: " + fullName);
    }
}
