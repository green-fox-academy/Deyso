public class drawChessTable {

    public static void main(String[] args) {
        // % % % %
        //  % % % %
        // % % % %
        //  % % % %
        // % % % %
        //  % % % %
        // % % % %
        //  % % % %

        for (int i = 0; i < 8; i++) {
            for (int k = 0; k != 4; k++) {
                System.out.print(" %");
            }
            System.out.println();
            if (i % 2 == 0) {
                System.out.print(" ");
            }
        }
    }

}

