//Sean Nishi
//1/30/2021
//IsSame.java for part of hw1
package com.company;
import java.util.Scanner;


public class IsSame {
    //Input: two user inputted strings from the console
    //Output: 'true' or 'false'
    public static void main(String[] args){
        //scanner for user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the first string: ");
        String str1 = scanner.nextLine();

        System.out.println("Please enter the second string: ");
        String str2 = scanner.nextLine();

        //compare strings
        boolean isEqual = str1.equals(str2);

        //output
        if (isEqual) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}
