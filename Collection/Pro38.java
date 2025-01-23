import java.util.*;
class MyStudent1 {
    int roll, age;
    String name;

    public MyStudent1(int roll, int age, String name) {
        this.roll = roll;
        this.age = age;
        this.name = name;
    }
}

class AgeCompare implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        MyStudent1 s1 = (MyStudent1) o1;
        MyStudent1 s2 = (MyStudent1) o2;

        if(s1.age > s2.age){
            return 1;
        }else if(s1.age < s2.age){
            return -1;
        }else {
            return 0;
        }
    }
}

class AgeCompareGenerics implements Comparator<MyStudent1>{

    @Override
    public int compare(MyStudent1 o1, MyStudent1 o2) {
        if(o1.age > o2.age){
            return 1;
        }else if(o1.age < o2.age){
            return -1;
        }else{
            return 0;
        }
    }
}

class NameCompare implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        MyStudent1 s1 = (MyStudent1) o1;
        MyStudent1 s2 = (MyStudent1) o2;

        return s1.name.compareTo(s2.name);
    }
}

class NameCompareGeneric implements Comparator<MyStudent1>{

    @Override
    public int compare(MyStudent1 o1, MyStudent1 o2) {
        return o1.name.compareTo(o2.name);
    }
}

public class Pro38 {
    public static void main(String[] args) {
        ArrayList<MyStudent1> students = new ArrayList<>();
        students.add(new MyStudent1(1, 19, "Kanad"));
        students.add(new MyStudent1(2, 21, "Kamal"));
        students.add(new MyStudent1(3, 22, "Keyur"));
        students.add(new MyStudent1(4, 17, "Karan"));

        //Collections.sort(students, new AgeCompare());
        //Collections.sort(students, new NameCompare());
        //Collections.sort(students, new AgeCompareGenerics());
        Collections.sort(students, new NameCompareGeneric());
        //Iterator iterator = students.iterator();
        Iterator<MyStudent1> iterator = students.iterator();

        while (iterator.hasNext()){
            //MyStudent1 tmp = (MyStudent1) iterator.next();
            MyStudent1 tmp = iterator.next();
            System.out.println(tmp.name+" "+tmp.age+" ROll "+tmp.roll);
        }

    }
}
