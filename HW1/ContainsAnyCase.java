//Sean Nishi
//1/30/2021
//ContainsAnyCase.java for part of hw1

package com.company;
import java.util.Scanner;

public class ContainsAnyCase {
    //Input: two strings
    //Output: 'true' if 1st string is in 2nd string else 'false'
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a word: ");
        String word = scanner.nextLine();
        System.out.println("Please enter a sentence: ");
        String sentence = scanner.nextLine();

        //parse sentence to see if word is in it, ignore casing
        if (sentence.toLowerCase().contains(word.toLowerCase())){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}
