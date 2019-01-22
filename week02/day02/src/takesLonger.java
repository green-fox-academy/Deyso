public class takesLonger {
    public static void main(String[] args) {

       /* String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

        // When saving this quote a disk error has occured. Please fix it.
        // Add "always takes longer than" to the StringBuilder (quote) between the words "It" and "you"
        // Using pieces of the quote variable (instead of just redefining the string)

        System.out.println(quote);*/


       String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

        String missingQuote = "always takes longer than";
        int whereStarts = quote.indexOf("It");
        quote = "Hofstadter's Law: It " + missingQuote + " you expect, even when you take into account Hofstadter's Law.";

        System.out.println(quote);

    }

}
