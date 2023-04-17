package com.Learntocode;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Integerparse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Hello World!\r");
        System.out.println("hello World!");


        String inputString = " 111 | Hot chocolate | 15 | 12.23";
        String[] tokens = inputString.split(Pattern.quote("|"));

        int id = Integer.parseInt(tokens[0]);
        String item = tokens[1];
        int amount = Integer.parseInt(tokens[2]);
        double total = Double.parseDouble(tokens[3]);

    }
}