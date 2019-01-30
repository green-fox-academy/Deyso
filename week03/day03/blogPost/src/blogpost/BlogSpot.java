package blogpost;

public class BlogSpot {
    String authorName;
    String title;
    String text;
    String publicationDate;

    public BlogSpot(String authorName, String title, String text, String publicationDate){
        this.authorName = authorName;
        this.title = title;
        this.text = text;
        this.publicationDate = publicationDate;
    }

    public void writeOutTheData(){
        System.out.println(title + " title by " + authorName + " posted at: " + publicationDate + " \n " + text);
    }



}
