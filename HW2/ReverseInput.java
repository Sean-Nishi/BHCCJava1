//Sean Nishi
//2/7/2021
//ReverseInput.java

import java.util.Scanner;

public class ReverseInput {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter something: ");
        String str = input.nextLine();

        //create a string builder with built-in reverse() fcn
        StringBuilder strB = new StringBuilder();
        strB.append(str);
        strB.reverse();

        String output = strB.toString();

        System.out.println(output);
    }
}
