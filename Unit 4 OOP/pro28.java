class Parent{
    String name;

    void showMessage(){
        System.out.println("Parent Method is Called");
    }
}

class Child extends Parent{
    int age;

    @Override
    void showMessage(){
        System.out.println("Child Method is Called");
    }
}

public class pro28 {
    public static void main(String[] args) {
        Parent p = new Child();
        p.name = "Kanad";

        //Child c = (Child) new Parent();
        Child c = (Child) p;
        c.age = 20;

        System.out.println(c.name);
        System.out.println(c.age);
    }
}
