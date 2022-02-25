//Sean Nishi
//2/7/2021
//SplitString.java

import java.util.Scanner;

public class SplitString {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String growingString = "";
        String inputString = "";
        String newString = "";

        //retrieve first string, assign to growingString
        System.out.println("Please enter a string: ");
        inputString = input.nextLine();
        growingString = inputString;

        //loop until empty input
        while(!inputString.isEmpty()){
            //retrieve new input
            System.out.println("Please enter a string: ");
            inputString = input.nextLine();
            if(inputString.isEmpty())
                break;

            //if input > current string, concat
            if(growingString.length() <= inputString.length()){
                growingString+= inputString;
            }
            else{//INPUT: index, growingString, inputString
                newString = growingString.substring(0, inputString.length()) + inputString + growingString.substring(inputString.length());
                growingString = newString;
                newString = "";
            }
        }
        System.out.println(growingString);
    }
}
