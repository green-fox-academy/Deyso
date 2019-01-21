import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class subStr {
    public static void main(String[] args) {

        //  Create a function that takes two strings as a parameter
        //  Returns the starting index where the second one is starting in the first one
        //  Returns `-1` if the second string is not in the first one


        //String temp = s.replace(sub, "");
        //int occ = (s.length() - temp.length()) / sub.length();

        String parameter ;
        String searchingParameter;

        Scanner parameterInput = new Scanner(System.in);
        System.out.println("Please add your parameter");
        parameter = parameterInput.next();
        Scanner searchingParameterInput = new Scanner(System.in);
        System.out.println("Please add your searchingParameter");
        searchingParameter = searchingParameterInput.next();

        System.out.println(parameter.contains(searchingParameter));

      /*  Pattern search = Pattern.compile((searchingParameter));
        Matcher matcher = search.matcher(parameter);
        if (matcher.find()){
            System.out.println("hello");
        }*/

        /*String mydata = "some string with 'the data i want' inside";
        Pattern pattern = Pattern.compile("'(.*?)'");
        Matcher matcher = pattern.matcher(mydata);
        if (matcher.find())
        {
            System.out.println(matcher.group(1));
        }*/
    }

}
