import sun.font.CompositeGlyphMapper;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class StringCommands {

    //----------------------------------------------------------------------
    public static void main(String[] args) {

        //.add();

        // create an empty array list with an initial capacity
        ArrayList<Integer> arrlist = new ArrayList<Integer>(5);
        arrlist.add(3);
        arrlist.add(4);
        arrlist.add(5);
        arrlist.add(6);
        arrlist.add(2, 7); // a haramdik helyre a tombbe belerakja a 7 szamot
        System.out.println(arrlist);

        //----------------------------------------------------

        //.addAll();

        ArrayList<Integer> tomb = new ArrayList<>();
        tomb.add(2);
        tomb.add(3);
        tomb.add(4);
        tomb.add(5);
        ArrayList<Integer> tomb2 = new ArrayList<>();
        tomb2.add(2);
        tomb2.add(3);
        tomb2.add(4);

        tomb2.addAll(tomb);  // valamibe.addAll(valami)  a valamibe beleadja a valami tartalmat meg ha megeggyezo akkoris
        System.out.println(tomb2);


        // .remove( , )

        ArrayList<Integer> valmai = new ArrayList<>();
        valmai.add(2);
        valmai.add(3);
        valmai.add(4);
        valmai.remove(2); // eltavolitja a harmadik elemet a listabol
    }
}
