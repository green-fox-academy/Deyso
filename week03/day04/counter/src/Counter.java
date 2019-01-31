public class Counter {
    public static void main(String[] args) {
        // Write a recursive function that takes one parameter: n and counts down from n.


        counter(10);
    }
    public static void counter(int n){
        if(n<=0){
            return;
        }
        counter(n-1);
        System.out.println("nein" + n);

    }

}
