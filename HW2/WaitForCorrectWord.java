//Sean Nishi
//2/7/2021
//WaitForCorrectWord.java

import java.util.Scanner;

public class WaitForCorrectWord {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the word: ");
        String str = input.nextLine();

        while(!str.equals(args[0])){
            System.out.println("the input was incorrect");
            System.out.println("Please reenter the word: ");
            str = input.nextLine();
        }

        System.out.println("the input was correct");
    }
}
