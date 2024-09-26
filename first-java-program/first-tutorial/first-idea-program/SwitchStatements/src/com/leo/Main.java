package com.leo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();

        // compares the contents of the string
//        if (fruit.equals("mango")) {
//            System.out.println("King of fruits");
//        }
//
//        if (fruit.equals("apple")) {
//            System.out.println("an apple a day keeps the doctor away");
//        }

//        String a = "Leo";
//        String b = "Leo";

//        switch (fruit) {
//            case "Mango" -> System.out.println("King of fruits");
//            case "Apple" -> System.out.println("An apple away keeps the doctor away");
//            case "Orange" -> System.out.println("Round fruit");
//            case "Grapes" -> System.out.println("Small round fruit");
//            default -> System.out.println("Please enter a valid fruit");
//        }

        int day = in.nextInt();
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
        }
    }
}