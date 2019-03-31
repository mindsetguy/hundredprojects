import java.util.List;
import java.util.ArrayList;

/**
 * Implementation of fibonacci 
 * https://en.wikipedia.org/wiki/Fibonacci_number
 * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89
 */
public class Fibonacci{
    public static void main(String[] args) {
        Fibonacci f = new Fibonacci();
        System.out.println(f.fib(5));
    }

    // return fibonacci of num
    public int fib(int num){

        // use an array as storage and hardcode the first 2 numbers of the sequence
        int [] storage = {0,1,0};

        // make a list to store the sequence
        List<Integer> fibonacciSequence = new ArrayList<>();

        // hardcode fib 0 and 1 inside the list
        fibonacciSequence.add(0, 0);
        fibonacciSequence.add(1, 1);

        for(int i=0; i<num; i++){
            storage[2] = storage[0] + storage[1];
            storage[0] = storage[1];
            storage[1] = storage[2];

            fibonacciSequence.add(storage[2]);
        }

        return fibonacciSequence.get(num);
    }

}