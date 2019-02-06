public class Main {
    public static void main(String[] args) {

        Gnirts uj = new Gnirts();
        uj.Gnirts("faszombeleazegeszbe");

        Shifter valami = new Shifter();
        valami.Shifter("tepocs");
        System.out.println(valami.charAt(3));

        try {
            System.out.println(uj.charAt(44));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("tul nagy a szam te idiota");
        }


    }


}
