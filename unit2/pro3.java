class demo3 {
    int ip1 = 20; // Global / Instance
    public void printer(){
        //int ip1 = 10; // Local
        System.out.println(ip1);
    }

    public void printer1(){
        // var ip1 = 1000;
        System.out.println(ip1);
    }
}

public class pro3 {
    public static void main(String[] args) {
        demo3 d3 = new demo3();
        d3.printer();
        d3.printer1();
    }
}
