//Sean Nishi
//1/30/2021
//Sum.java for hw1

package com.company;
import java.util.Scanner;

public class Sum {
    //Input: two user inputted ints from the console
    //Output: sum of ints
    public static void main(String[] args){
        //scanner for user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the first int: ");
        int num1 = scanner.nextInt();

        System.out.println("Please enter the second int: ");
        int num2 = scanner.nextInt();

        //add nums
        int sum = num1 + num2;

        //output
        System.out.println(sum);
    }
}
