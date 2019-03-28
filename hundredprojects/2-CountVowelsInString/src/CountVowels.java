import java.util.List;
import java.util.ArrayList;

/**
 * This class demonstrates how to count vowels of a String in java
 */
public class CountVowels{

    public static void main(String[] args) {
        
        // String to be used
        String string = "Stella";

        // Instance a new Object because of static
        CountVowels vow = new CountVowels();

        // count the length of String, vowels and consonants
        List<String> list = vow.countStringLengthVowelsConsonants(string);

        System.out.println("The length of the string is: " + list.get(0) + " characters.");
        System.out.println("The number of vowels inside the string is:" + list.get(1) + ".");
        System.out.println("The number of consonants inside the string is:" + list.get(2) + ".");
    }

    /**
     * Counts length, vowels, consonants of a String
     * @param string String to be used
     * @return a list containing length, vowels and consonants of the input String
     */
    public List<String> countStringLengthVowelsConsonants(String string){

        int numberOfVowels = 0;
        int numberOfConsonants = 0;
        List<String> list = new ArrayList<String>();

        StringBuilder builder = new StringBuilder();
        builder.append(string);

        for(int i=0; i< builder.length(); i++){
            char a = builder.charAt(i);
            if(a == 'a' || a== 'i' || a=='u' || a=='e' || a=='o'){
                numberOfVowels++;
            }else{
                numberOfConsonants++;
            }
        }

        list.add(String.valueOf(builder.length()));
        list.add(String.valueOf(numberOfVowels));
        list.add(String.valueOf(numberOfConsonants));

        return list;
    }

}