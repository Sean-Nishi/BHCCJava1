//Sean Nishi
//2/7/2021
//SumRange.java

public class SumRange {
    //INPUT: 3 runtime args, arg1 < arg2
    //OUTPUT: print the sum of said args

    //EX: input: 3, 10, 2
    //output: 3 + 5 + 7 + 9 = 24
    public static void main(String[] args){
        //calc sum of every nth whole number between arg1 and arg2, arg3 = n
        int start = Integer.parseInt(args[0]);
        int limit = Integer.parseInt(args[1]);
        int step = Integer.parseInt(args[2]);
        int result = 0;

        for(int i = 0; (start + step*i) <= limit; i++){
            result += start + step*i;
        }

        //output
        System.out.println(result);

    }

}
