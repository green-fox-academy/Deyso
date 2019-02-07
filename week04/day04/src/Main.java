import java.util.Arrays;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        givenString("balala");
    }

    public static void givenString(String got) {
        HashMap<Character, Integer> dictionary = new HashMap<>();
        char tempArray[] = got.toCharArray();
        Arrays.sort(tempArray);
        for (char newChar : tempArray) {

            if (dictionary.containsKey(newChar)) {
                int count = dictionary.get(newChar);
                dictionary.put(newChar, count += 1);
            } else if (!dictionary.containsKey(newChar)){
                dictionary.put(newChar,1);
            }
        }
        System.out.println(dictionary);
    }


}
