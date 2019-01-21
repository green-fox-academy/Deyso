public class swapElements {
    public static void main(String[] args) {
        // - Create an array variable named `abc`
        //   with the following content: `["first", "second", "third"]`
        // - Swap the first and the third element of `abc`

        String[] abc = {"first", "second", "third"};

                for (int i = 0; i < abc.length;i++) {
                    String newLocation = abc[2];
                    abc[2] = abc[0];
                    abc[0] = newLocation;
                    System.out.println(abc[i]);
                }




    }

}
