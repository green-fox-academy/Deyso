package blogpost;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class MainBlog {
    public static void main(String[] args) {

        String timeStamp = new SimpleDateFormat("yyyy-MM-dd hh:mm").format(Calendar.getInstance().getTime());
        Scanner scannerName = new Scanner(System.in).useDelimiter("\n");
        Scanner scannerTitle = new Scanner(System.in).useDelimiter("\n");
        Scanner scannerText = new Scanner(System.in).useDelimiter("\n");
        System.out.println("What is your name? ");
        String  authorName = scannerName.next();
        System.out.println("Give a tittle please ");
        String title = scannerTitle.next();
        System.out.println("Write the content ");
        String text = scannerText.next();
        String publicationDate = timeStamp;


        BlogSpot firstPerson = new BlogSpot(authorName,title,text,publicationDate);

        firstPerson.writeOutTheData();

    }


}
