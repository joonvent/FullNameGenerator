package com.Learntocode;

import java.util.Scanner;

public class HighScorewins {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Team and Score Information(Home Visitor 15 11)");
        String scoreinfo = scanner.nextLine().trim();

        String [] info = scoreinfo.split(" ");


        String team1scores =( info[0] + Integer.parseInt(info[2]));
        String team2scores =(info[1] + Integer.parseInt(info[3]));

        System.out.println(team1scores);
        System.out.println(team2scores);







    }
}
