public class Sponsor extends Person {
    String company;
    int hiredStudents;

    public Sponsor(String name, int age, String gender, String company) {
        super(name, age, gender);
        this.company = company;

    }

    public Sponsor(){
        name = "Jane Doe";
        age = 30;
        gender = "female";
        company = "Google and "+hiredStudents + " to 0";
    }

    public void introduce() {
        System.out.println("Hi. I'm " + name + ", a " + age + " year old " + gender + " who represents " + company + " and hired " + hiredStudents + " students so far");
    }

    public void hire(){
        hiredStudents++;
    }

    public void getGoal(){
        System.out.println("Hire brilliant junior software developers.");
    }

}
