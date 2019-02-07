import java.util.Arrays;

public class Anagram {
    //Write a function, that takes two strings and returns a boolean value
    //based on if the two strings are Anagramms or not.
    //Create a test for that.

    public boolean compare(String firstString, String secoundString) {

        if (firstString.length() != secoundString.length()){
            return false;
        }

        char tempArray[] = firstString.toLowerCase().toCharArray();
        char tempArray1[] = secoundString.toLowerCase().toCharArray();

        Arrays.sort(tempArray);
        Arrays.sort(tempArray1);

        if (new  String(tempArray).equals(new String(tempArray1))) {
            return true;
        }
        return false;
    }

}
