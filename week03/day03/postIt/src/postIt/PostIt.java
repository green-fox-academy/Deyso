package postIt;

import java.awt.*;

public class PostIt {
    String backgroundColor;
    String text;
    String textColor;

    public PostIt(String backgroundColor, String textColor){
        this.backgroundColor = backgroundColor;
        text = "Something text";
        this.textColor= textColor;
    }

    public void tellAbout(){
        System.out.println("My background color is " + backgroundColor + " and the text is " + text + " and the text color is "
        + textColor);
        
    }

    }
