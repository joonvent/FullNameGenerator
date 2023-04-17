package com.Learntocode;

import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class theaterreservations {


    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Please Enter Your Name:(First Last)");
        String name= scanner.nextLine().trim();


        System.out.println("Please Enter The Date of The Reservation:(MM/dd/yyy)");
        String date= scanner.nextLine().trim();



        System.out.println("Please How Many Tickets:");
        String tickets= scanner.nextLine().trim();


        System.out.println("Thank You For Your Purchase!");

        System.out.println("Thank You " + name +" You Purchased " + tickets + " Tickets For The Date Of " + date);



}









}