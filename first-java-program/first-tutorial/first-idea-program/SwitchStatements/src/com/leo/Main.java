package com.leo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();

        // compares the contents of the string
        if (fruit.equals("mango")) {
            System.out.println("King of fruits");
        }

        if (fruit.equals("apple")) {
            System.out.println("an apple a day keeps the doctor away");
        }

//        String a = "Leo";
//        String b = "Leo";

        System.out.println();
    }
}