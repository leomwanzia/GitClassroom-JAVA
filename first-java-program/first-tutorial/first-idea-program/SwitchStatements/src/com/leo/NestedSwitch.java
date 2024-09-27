package com.leo;

import java.sql.SQLOutput;
import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();
        String department = in.next();


        switch (empID) {
            case 1 -> System.out.println("Leo Mwanzia");
            case 2 -> System.out.println("Ruto Mwizi");
            case 3 -> {
                System.out.println("Emp Number 3");
                switch (department) {
                    case "IT" -> System.out.println("IT department");
                    case "Management" -> System.out.println("Management Department");
                    default -> System.out.println("No department entered");
                }
            }
            default -> System.out.println("Enter Correct empID");
        }

    }
}
