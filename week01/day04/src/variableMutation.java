public class variableMutation {

 /*   int a = 3;
    // make the "a" variable's value bigger by 10

    System.out.println(a);

    int b = 100;
    // make b smaller by 7

    System.out.println(b);

    int c = 44;
    // please double c's value

    System.out.println(c);

    int d = 125;
    // please divide by 5 d's value

    System.out.println(d);

    int e = 8;
    // please cube of e's value

    System.out.println(e);

    int f1 = 123;
    int f2 = 345;
    // tell if f1 is bigger than f2 (print as a boolean)

    int g1 = 350;
    int g2 = 200;
    // tell if the double of g2 is bigger than g1 (print as a boolean)

    int h = 135798745;
    // tell if it has 11 as a divisor (print as a boolean)

    int i1 = 10;
    int i2 = 3;
    // tell if i1 is higher than i2 squared and smaller than i2 cubed (print as a boolean)

    int j = 1521;
    // tell if j is dividable by 3 or 5 (print as a boolean)

    String k = "Apple";
    //fill the k variable with its content 4 times

    System.out.println(k);*/

    public static void main(String[] args) {

        int a = 3;
        a += 8;

        System.out.println(a);

        int b = 100;
        b -= 94;

        System.out.println(b);

        int c = 44;
        c *= 2;

        System.out.println(c);

        int d = 125;
        d /= 5;

        System.out.println(d);

        int e = 8;
        e *= e;

        System.out.println(e);

        int f1 = 123;
        int f2 = 345;
        boolean biggerOrNo;

        if (f1 > f2) {
            biggerOrNo = false;
            System.out.println(biggerOrNo);
        } else {
            biggerOrNo = true;
            System.out.println(biggerOrNo);
        }

        int g1 = 350;
        int g2 = 200;
        boolean doubleBigger;


        if ((g2 * 2) > g1) {
            doubleBigger = true;
            System.out.println(doubleBigger);
        } else {
            doubleBigger = false;
            System.out.println(doubleBigger);
        }

        boolean hNumber;

        int h = 135798745;
        if ((h % 11) == 0) {
            hNumber = true;
        } else {
            hNumber = false;
        }

        int i1 = 10;
        int i2 = 3;
        boolean iSomething;

        if (i1 > (i2*i2) || i1 < (i2*i2*i2)){
            iSomething = true;
            System.out.println(iSomething);
        } else {
            iSomething = false;
            System.out.println(iSomething);
        }

        int j = 1521;
        boolean jDivide;

        if (((j%3) == 0) || ((j%5) ==0)){
            jDivide = true;
            System.out.println(jDivide);
        } else {
            jDivide = false;
            System.out.println(jDivide);
        }

        String k = "Apple";
        for (int i = 0; i <=2; i++){
            k += " Apple";
        }
        System.out.println(k);






    }

}
