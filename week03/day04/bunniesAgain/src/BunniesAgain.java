public class BunniesAgain {
    public static void main(String[] args) {

        // We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies
        // (1, 3, ..) have the normal 2 ears. The even bunnies (2, 4, ..) we'll say
        // have 3 ears, because they each have a raised foot. Recursively return the
        // number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).

        int all = bunnyEarsCounetr(9);
        System.out.println(all);


    }

    public static int bunnyEarsCounetr(int bunnies) {
        if (bunnies == 0) {
            return 0;
        } else if (bunnies % 2 != 0) {
            System.out.println(bunnies);
            return (bunnies / bunnies) * 2 + bunnyEarsCounetr(bunnies - 1);
        } else if (bunnies % 2 == 0) {
            System.out.println(bunnies);
            return (bunnies / bunnies) * 3 + bunnyEarsCounetr(bunnies - 1);
        }
        return 0;
    }

}
