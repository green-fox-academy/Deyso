public class Power {
    public static void main(String[] args) {
        // Given base and n that are both 1 or more, compute recursively (no loops)
        // the value of base to the n power, so powerN(3, 2) is 9 (3 squared).


        int power = power(5);
        System.out.println(power);

    }
    public static int power(int n){
        if(n>0){
            System.out.println(n*n);
            power(n-1);
        }
        return n*n;


    }

}
