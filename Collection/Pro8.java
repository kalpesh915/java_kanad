import java.util.ArrayList;

class Student{
    int roll;
    String fname, lname;

    public Student(int roll, String lname, String fname) {
        this.roll = roll;
        this.lname = lname;
        this.fname = fname;
    }

    public void printer(){
        System.out.println("Welcome "+fname+" "+lname+" your roll is "+roll);
    }
}

public class Pro8 {
    public static void main(String[] args) {
        Student s1, s2, s3, s4, s5;

        s1 = new Student(1, "Kanad", "Joshi");
        s2 = new Student(2, "Kamal", "Joshi");
        s3 = new Student(3, "Keyur", "Joshi");
        s4 = new Student(4, "Kashyap", "Joshi");
        s5 = new Student(5, "Kartik", "Joshi");

        ArrayList<Student> myStudents = new ArrayList<Student>();
        myStudents.add(s1);
        myStudents.add(s2);
        myStudents.add(s3);
        myStudents.add(s4);
        myStudents.add(s5);

        for(Student tmp : myStudents){
            tmp.printer();
        }
    }
}
