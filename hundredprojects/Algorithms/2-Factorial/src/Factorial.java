
/**
 * Implementation of factorial
 * https://en.wikipedia.org/wiki/Factorial
 * 5! = 5*4*3*2*1
 * 
 */
public class Factorial{

    public static void main(String[] args) {
        Factorial f = new Factorial();
        System.out.println(f.fact(4));
    }

    public int fact(int num){

        // hardcode the first iteration
        int numMinusOne = num - 1;
        int sum = num * numMinusOne;
        numMinusOne--;

        // since we hardcoded the first iteration we need to set num -2
        for(int i=0; i< num-2; i++){

            sum = sum * numMinusOne;  
            numMinusOne--;
        }    
        
        return sum;
    }
}