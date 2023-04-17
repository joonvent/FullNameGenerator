package com.Learntocode;

import java.util.Scanner;
import java.util.regex.Pattern;

public class fullnameparser {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Please Enter Your Name(First Middle Last):");
        String fullName = input.nextLine().trim();

        String[] nameParts = fullName.split( " ");


        String firstname = nameParts[0];
        String lastname = nameParts[1];
        String middlename = nameParts[2];

        System.out.println("First Name:" +nameParts[0]);
        System.out.println("Middle Name:" + nameParts[1]);
        System.out.println("Last Name: " + nameParts[2]);



    }
}
