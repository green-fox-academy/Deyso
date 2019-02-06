public class Shifter implements CharSequence {
    String name;
    int shifter;
    int index;

    public void Shifter(String name, int shifter){
        this.name = name;
        this.shifter = shifter;
    }

    public void Shifter(String name){
        this.name = name;
        this.shifter = 0;

    }


    @Override
    public int length() {
        return name.length();
    }

    @Override
    public char charAt(int index) {
        this.index = index;
        index = (index+shifter);
        return name.charAt(index) ;
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return null;
    }
}
