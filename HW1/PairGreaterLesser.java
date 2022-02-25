package com.company;

import java.util.Scanner;

public class PairGreaterLesser {
    //Input: 4 numbers
    //Output: 'true' if num1 < num2 and num3 < num4 AND sum(num1, num2) < sum(num3, num4) else 'false'
    public static void main(String[] args){
        int[] num = new int[4];
        int count = 1;
        //Input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        num[0] = scanner.nextInt();
        while(count < 4) {
            System.out.println("Please enter another number: ");
            num[count] = scanner.nextInt();
            count++;
        }

        //Output
        if ((num[0] < num[1]) && (num[2] < num[3]) && (num[0]+num[1] < num[2]+num[3])){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}
