package com.Learntocode;

import java.util.Scanner;

public class HighScorewins {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Team and Score Information(Home Visitor 15 11)");
        String scoreinfo = scanner.nextLine().trim();

        String [] info = scoreinfo.split(" ");

        String team1= (info[0]);
        String team2= info[1];
        int team1score= Integer.parseInt(info[2]);
        int team2score= Integer.parseInt(info[3]);

        System.out.println(team1);
        System.out.println(team2);
        System.out.println(team1score);
        System.out.println(team2score);


    }
}
