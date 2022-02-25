//Sean Nishi
//2/7/2021
//AllEvenOdd.java

public class AllEvenOdd {
    public static void main(String[] args){
        //total number of runtime args
        int counter = 0;
        int output = 0;
        for(String arg : args){
            counter+=1;
        }

        //if even number of args
        if(counter%2 == 0){
            //count number of even number in args
            for(String element : args){
                if (Integer.parseInt(element)%2 ==0)
                    output++;
            }

            System.out.println(output);
        }
        else{//else odd number of args
            for (String element: args){
                if (Integer.parseInt(element)%2 != 0)
                    output++;
            }
            System.out.println(output);
        }

    }
}
