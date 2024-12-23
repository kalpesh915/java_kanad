public class pro9 {
    public static void main(String[] args) {
        int data[] = new int[5];
        try{
            data[0] = 100;
            data[1] = 0;
            data[2] = 12;
            data[3] = 20;
            data[4] = 22;
            data[5] = 22;
            try{
                System.out.println("Division is "+(data[0] / data[1]));
            }catch (ArithmeticException err){
                System.out.println("Error is "+err);
            }

        }catch (RuntimeException err){
            System.out.println("Error is "+err);
        }
    }
}
