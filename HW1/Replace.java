//Sean Nishi
//1/30/2021
//Replace.java for part of hw1

package com.company;
import java.util.Scanner;

public class Replace {
    //Input: three user inputted values, two chars, one string
    //Output: 'true' or 'false'
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //input
        System.out.println("Please enter the first char: ");
        char ch1 = scanner.next().charAt(0);
        System.out.println("Please enter the second char: ");
        char ch2 = scanner.next().charAt(0);
        scanner.reset();
        Scanner scanner1 = new Scanner(System.in);

        System.out.println("Please enter a sentence: ");
        String str = scanner1.nextLine();

        //for each ch1 in str, change to ch2
        String newStr = str.replace(ch1, ch2);

        //output
        System.out.println(newStr);
    }
}
