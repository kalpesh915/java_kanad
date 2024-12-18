interface Interface1{
    default void msg(){
        System.out.println("Default() of Interface 1");
    }
}

interface Interface2{
    default void msg(){
        System.out.println("Default() of Interface 2");
    }
}

class DefaultCaller implements Interface1, Interface2{
    public void msg(){
        //Interface1.super.msg();
        Interface2.super.msg();
    }
}

public class pro32 {
    public static void main(String[] args) {
        DefaultCaller dc = new DefaultCaller();
        dc.msg();
    }
}
