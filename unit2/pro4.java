class demo4{
    static int ip1 = 100;
}

public class pro4 {
    public static void main(String[] args) {
        demo4 d4_1 = new demo4();
        demo4 d4_2 = new demo4();

        System.out.println(d4_1.ip1);
        System.out.println(d4_2.ip1);

        System.out.println(demo4.ip1);

        demo4.ip1 = 110;

        System.out.println(d4_1.ip1);
        System.out.println(d4_2.ip1);

        System.out.println(demo4.ip1);
    }
}
