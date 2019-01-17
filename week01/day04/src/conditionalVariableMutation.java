import java.util.Scanner;

public class conditionalVariableMutation {

    public static void main(String[] args) {

        double a;
        int out = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Please write a number");
        a = input.nextDouble();

        if ((a % 2) != 0) {
            out++;
        }
            System.out.println(out);


        int b;
        String out2 = new String();

        Scanner input1 = new Scanner(System.in);

        System.out.println("Write a number");
        b = input1.nextInt();

        if (b >= 10 && b <= 20) {
            System.out.println(out2.replace("", "Sweet!"));
        } else if (b < 10) {
            System.out.println(out2.replace("", "Less!"));
        } else if (b > 20) {
            System.out.println(out2.replace("", "More!"));
        }


        int c = 123;
        int credits;
        boolean isBonus = false;

        Scanner input2 = new Scanner(System.in);

        System.out.println("Please add your credits");
        credits = input2.nextInt();

        if (credits >= 50 && isBonus == false){
            c-=2;
            System.out.println(c);
        } else if( credits<50 && isBonus ==false){
            c--;
            System.out.println(c);
        } else if (isBonus == true){
            System.out.println(c);
        }

        /*int d = 8;
        int time = 120;
        String out3 = "";*/
        // if d is dividable by 4
        // and time is not more than 200
        // set out3 to "check"
        // if time is more than 200
        // set out3 to "Time out"
        // otherwise set out3 to "Run Forest Run!"

        int d;
        int time;
        String out3 = new String();

        Scanner input3 = new Scanner(System.in);

        System.out.println("Please add d");
        d = input3.nextInt();
        System.out.println("Please add the time");
        time = input3.nextInt();

        if ((d%4)==0 && time <= 200){
            System.out.println(out3.replace("", "check"));
        } else if((d%4)==0 && time>200){
            System.out.println(out3.replace("","Time out"));
        } else {
            System.out.println(out3.replace("", "Run Forest Run!"));
        }
    }
}
