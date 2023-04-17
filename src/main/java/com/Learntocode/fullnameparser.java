package com.Learntocode;

import java.util.Scanner;

public class fullnameparser {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Please Enter Your Name(First Last):");
        String fullName = input.nextLine().trim();

        String[] nameParts = fullName.split( " ");


        String firstname = nameParts[0];
        String lastname = nameParts[1];

        System.out.println(nameParts[0]);
        System.out.println(nameParts[1]);


    }
}
