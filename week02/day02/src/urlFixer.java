public class urlFixer {
    public static void main(String[] args) {
       /* public class UrlFixer {
            public static void main(String... args){
                String url = "https//www.reddit.com/r/nevertellmethebots";

                // Accidentally I got the wrong URL for a funny subreddit. It's probably "odds" and not "bots"
                // Also, the URL is missing a crutial component, find out what it is and insert it too!
                // Try to solve it more than once using different String functions!

                System.out.println(url);
            }
        }
        */

       String url = "https//www.reddit.com/r/nevertellmethebots";
        url = url.replace("bots","odds");
        url = url.replace("//","://");
        System.out.println(url);

       /* if (url.contains("https//")){
            url = url.replace("https//","https://");
        }
        if (url.endsWith("bots")){
            url = url.replace("bots","odds");
        }
        System.out.println(url);*/





    }


}
