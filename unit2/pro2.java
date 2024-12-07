class demo2 {
    public void printer(){
        int ip1 = 10; // Local
        System.out.println(ip1);
    }

    public void printer1(){
        //System.out.println(ip1);
    }
}

public class pro2 {
    public static void main(String[] args) {
        demo2 d2 = new demo2();
        d2.printer();
    }
}
