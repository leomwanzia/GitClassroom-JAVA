package com.leo;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        // take input from user till user does not press X or x
        int ans = 0;
        while (true) {
            // take the operator as input
            System.out.print("Enter the operator : ");
            char op = in.next().trim().charAt(0); // Reads the first character of the input and stores it in 'op'
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                // input 2 numbers

                System.out.println("Enter two numbers : ");
                int num1 = in.nextInt();
                int num2 = in.nextInt();

                if (op == '+') {
                    ans = num1 + num2;
                }
                if (op == '-') {
                    ans = num1 - num2;
                }
                if (op == '*') {
                    ans = num1 * num2;
                }
                if (op == '/') {
                    if(num2 != 0) {
                        ans = num1 / num2;
                    }
                }
                if (op == '%') {
                    ans = num1 % num2;
                }
            } else if (op == 'x' || op == 'X') {
                break;
            } else {
                System.out.println("Invalid Operation");
            }
            System.out.println(ans);
        }
    }
}
