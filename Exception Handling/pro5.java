public class pro5 {
    public static void main(String[] args) {
        int ip1 = 100, ip2 = 0;

        System.out.println("Before Divide");

        try{
            System.out.println("Division is "+(ip1 / ip2));
            System.out.println("After Error Code");
        }catch (ArithmeticException err){
            //System.out.println("Error is "+err);
            System.err.println("Error is "+err);
        }

        System.out.println("After Divide");
    }
}
