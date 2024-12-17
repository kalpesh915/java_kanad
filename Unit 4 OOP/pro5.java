class Demo5 {
    Demo5(){
        System.out.println("Constructor Called");
    }
}

public class pro5 {
    public static void main(String[] args) {
        Demo5 d5 = new Demo5();
        Demo5 d51 = new Demo5();
        Demo5 d52 = new Demo5();
        new Demo5();
    }
}
