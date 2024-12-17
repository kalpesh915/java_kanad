class Students{
    int roll;
    String name;
    static String college = "Atmiya University";

    Students(int roll, String name){
        this.roll = roll;
        this.name = name;
    }

    public void printData(){
        System.out.println("Welcome "+name+" to "+college+" Your id is "+roll);
    }

    static public void getCollegeName(){
        System.out.println("College Name is "+college);
    }
}
public class pro9 {
    public static void main(String[] args) {
        Students s1 = new Students(1, "Kanad");
        Students s2 = new Students(2, "Kapil");
        Students s3 = new Students(3, "Kamal");

        Students.college = "Darshan University";

        s1.printData();
        s2.printData();
        s3.printData();

        s1.getCollegeName();

        Students.getCollegeName();
    }
}
