public class Gnirts implements CharSequence  {

    String name;
    int index;


    public void Gnirts(String name){
        this.name = name;
    }



    @Override
    public int length() {
        return name.length();
    }

    @Override
    public char charAt(int index) {
        this.index =index;
        index = name.length() -(1+index);
        return name.charAt(index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return null;
    }
}
