import java.util.Arrays;
import java.util.HashMap;

public class CountLetters {
    //Write a function, that takes a string as an argument and
    //returns a dictionary with all letters in the string as keys,
    // and numbers as values that shows how many occurrences there are.
    //Create a test for that.


    public HashMap givenString(String got) {

        char tempArray[] = got.toCharArray();
        Arrays.sort(tempArray);
        HashMap<Character, Integer> dictionary = new HashMap<>();
        for (char gotCharacter : tempArray) {
            if (dictionary.containsKey(gotCharacter)){
                int amount = dictionary.get(gotCharacter);
                dictionary.put(gotCharacter, amount+1);
            }else if (!dictionary.containsKey(gotCharacter)){
                dictionary.put(gotCharacter,1);
            }
        }
        return dictionary;
    }


}
