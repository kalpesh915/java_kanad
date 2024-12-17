public class pro11 {
    static int ip1 = 10;

    static class example{
        static public void printer(){
            System.out.println("Value of ip1 is "+ip1);
        }
    }

    public static void main(String[] args) {
        pro11.example.printer();
    }
}
