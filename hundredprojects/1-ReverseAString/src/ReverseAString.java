/**
 * This class demonstrates how to reverse a String in java
 */
public class ReverseAString{

    public static void main(String[] args) {
        
        // string to be reversed
        String string = "ocraM";

        // instanciate object because of static
        ReverseAString rev = new ReverseAString();
        System.out.println(rev.reverse(string));
    }

    /**
     * Reverses a String
     * @param string string that will be reversed
     * @return reversed string
     */
    public String reverse(String string){
        StringBuilder builder = new StringBuilder();

        builder.append(string);
        builder.reverse();

        return builder.toString();
    }
}