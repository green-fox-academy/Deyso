public class Bunny {
    public static void main(String[] args) {
        // We have a number of bunnies and each bunny has two big floppy ears.
        // We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).


        int totalNumber = allBunnyEars(55);
        System.out.println(totalNumber);
    }

    public static int allBunnyEars(int numberOfBunny) {

        if (numberOfBunny == 0) {
            return 0;
        }
        allBunnyEars(numberOfBunny - 1);
        return numberOfBunny * 2  ;
    }

}
