import com.sun.xml.internal.ws.api.ha.StickyFeature;

public class Student extends Person {
    String previousOrgnization;
    int skippedDays = 0;


    public Student(String name, int age, String gender, String previousOrgnization) {
        super(name, age, gender);
        this.previousOrgnization = previousOrgnization;
    }

    public Student(){
        name = "Jane Doe";
        age = 30;
        gender = "female";
        previousOrgnization = "The School of Life";
    }

    public void getGoal() {
        System.out.println("Be a junior software developer.");
    }

    public void introduce() {
        System.out.println("Hi, I'm " + name + ", a " + age + " year old " + gender + " from " + previousOrgnization + " who skipped " + skippedDays + " days from the course already.");
    }

    public void skipDays(int numberOfDays){
        this.skippedDays += numberOfDays;
    }




}
