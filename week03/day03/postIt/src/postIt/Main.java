package postIt;

import javafx.geometry.Pos;

public class Main {
    public static void main(String[] args) {

        PostIt idea1 = new PostIt("Orange","Blue");
        PostIt awesome = new PostIt("Pink","Black");
        PostIt superb = new PostIt("Yellow","Green");

        idea1.tellAbout();
    }


}
