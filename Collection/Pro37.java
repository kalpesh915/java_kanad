import java.util.*;

class MyStudent implements Comparable<MyStudent>{
    int roll, age;
    String name;

    public MyStudent(int roll, int age, String name) {
        this.roll = roll;
        this.age = age;
        this.name = name;
    }

    @Override
    public int compareTo(MyStudent o) {
        if(age < o.age){
            return  1;
        }else if(age > o.age){
            return -1;
        }else{
            return 0;
        }
    }
}

public class Pro37 {
    public static void main(String[] args) {
        ArrayList<MyStudent> students = new ArrayList<>();
        students.add(new MyStudent(1, 19, "Kanad"));
        students.add(new MyStudent(2, 21, "Kamal"));
        students.add(new MyStudent(3, 22, "Keyur"));
        students.add(new MyStudent(4, 17, "Karan"));
        Collections.sort(students);

        for(MyStudent m : students){
            System.out.println(m.name+" "+m.age+" "+m.roll);
        }

    }
}
