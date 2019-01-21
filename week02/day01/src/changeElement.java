public class changeElement {
    public static void main(String[] args) {
        // - Create an array variable named `s`
        //   with the following content: `[1, 2, 3, 8, 5, 6]`
        // - Change the 8 to 4
        // - Print the fourth element

        int[] s = {1, 2, 3, 8, 5, 6};
        boolean runTime = true;

        for (int i = 0; i<s.length; i++){
            if (s[i]==8){
                s[i]=4;
            }
        }
        System.out.println(s[3]);

    }

}
