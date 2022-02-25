//Sean Nishi
//1/30/2021
//LessThanOrEqual.java for part of hw1

package com.company;
import java.util.Scanner;

public class LessThanOrEqual {
    //Input: two ints
    //Output: 'true' if int1 <= int2 else, 'false'
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an int: ");
        int num1 = scanner.nextInt();
        System.out.println("Please enter another int: ");
        int num2 = scanner.nextInt();

        if (num1 <= num2){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}
