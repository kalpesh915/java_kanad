class SuperParent{
    SuperParent(){
        System.out.println("Super Class Constructor Called");
    }
    public void msg(){
        System.out.println("Welcome to Super Keyword Example");
    }
}

class SuperChild extends SuperParent{
    SuperChild(){
        super();
        super.msg();
    }

    public String toString(){
        return "Custome to String Method";
    }
}

public class pro21 {
    public static void main(String[] args) {
        SuperChild sc = new SuperChild();
        System.out.println(sc);
        System.out.println(sc.toString());
    }
}
