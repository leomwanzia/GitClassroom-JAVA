package com.leo;

public class ReverseCount {
    public static void main(String[] args) {
        int num = 23597;

        int ans = 0;

        while (num > 0) {
            int rem = num % 10; //gives the last digit of num by dividing by 10
            num = num / 10; //updating num by % integer division by 10,removes the last digit from num

            ans = ans * 10 + rem; // updates the 'ans'
        }

        System.out.println(ans);
    }
}
