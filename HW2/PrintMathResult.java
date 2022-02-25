//Sean Nishi
//2/7/2021
//PrintMathResult.java

import java.util.Scanner;

public class PrintMathResult {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double result = 0.0;

        //input
        System.out.println("Please enter a string operand (+, -, *, /)");
        String operand = input.nextLine();

        System.out.println("Please enter an int: ");
        int int1 = input.nextInt();

        System.out.println("Please enter another int: ");
        int int2 = input.nextInt();

        //figure out which operand user wants and calc result
        switch(operand){
            case "+":
                result = (int) int1 + int2;
                break;
            case "-":
                result = (int) int1 - int2;
                break;
            case "*":
                result = (double) int1 * int2;
                break;
            case "/":
                result = (double) int1 / int2;
                break;
        }

        //print result
        System.out.println((int)result);

    }
}
