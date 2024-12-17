class ParentClass{
    ParentClass(){
        System.out.println("Parent Class Constructor");
    }
}

class ChildClass extends ParentClass{
    ChildClass(){
        super();
        System.out.println("Child Class Constructor");
    }
}

public class pro15 {
    public static void main(String[] args) {
        ChildClass c = new ChildClass();
    }
}
