class Student{
    int roll;
    String fname, lname;

    Student(){
        this.roll = 0;
        this.fname = "N/A";
        this.lname = "N/A";
    }

    Student(int roll, String fname, String lname){
        this.roll = roll;
        this.fname = fname;
        this.lname = lname;
    }

    public void getDetails(){
        System.out.println("Welcome "+fname+" "+lname+" your roll no. is "+roll);
    }
}
public class pro6 {
    public static void main(String[] args) {
        Student std1 = new Student(11, "Kanad", "Joshi");
        Student std2 = new Student();
        std1.getDetails();
        std2.getDetails();
    }
}
