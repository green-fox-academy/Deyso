public class incrementElement {
    public static void main(String[] args) {

        // - Create an array variable named `t`
        //with the following content: `[1, 2, 3, 4, 5]`
        //       - Increment the third element
        //       - Print the third element

        int [] t = {1,2,3,4,5};
        int thirdElement = t[2]+1;
        System.out.println(thirdElement);

        //secound option
      /*
        for (int i = 0; i<t.length; i++){
            if (t[i] == t[2]){
                t[i]++;
            }

        }
        System.out.println(t[2]);*/

    }

}
