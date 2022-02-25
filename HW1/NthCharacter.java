package com.company;

import java.util.Scanner;

public class NthCharacter {
    //Input: one int, one string that is a number
    //Output: print char at index associated with 1st value found in the sentence
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int index = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Please enter a sentence that contains a number: ");
        String sentence = scanner.nextLine();

        //output, the char at the index
        System.out.println(sentence.charAt(index));

    }
}
