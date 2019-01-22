public class takesLonger {
    public static void main(String[] args) {

       /* String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

        // When saving this quote a disk error has occured. Please fix it.
        // Add "always takes longer than" to the StringBuilder (quote) between the words "It" and "you"
        // Using pieces of the quote variable (instead of just redefining the string)

        System.out.println(quote);*/


        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

        String missingQuote = "always takes longer than";

        /*String string = "004-034556";
        String[] parts = string.split("-");
        String part1 = parts[0]; // 004
        String part2 = parts[1]; // 034556*/

        String[] splitingQuote = quote.split("It");
        String firstSplit = splitingQuote[0];
        String secoundSplit = splitingQuote[1];
        String empty = "";


         String goodOne = firstSplit + secoundSplit;

        empty = goodQuote(firstSplit, secoundSplit,missingQuote);
        System.out.print(empty);
    }

    public static String goodQuote(String first, String secound,String missing) {
        String into = first + "It " + missing + secound;
        //System.out.println(into);

        return into;
    }

}
