public class pro6 {
    public static void main(String[] args) {
        int data[] = new int[5];
        try{
            data[0] = 100;
            data[1] = 0;
            data[2] = 12;
            data[3] = 20;
            data[4] = 22;
            data[5] = 22;

            System.out.println("Division is "+(data[0] / data[1]));
        }catch (ArithmeticException err){
            System.out.println("Error is "+err);
        }catch (ArrayIndexOutOfBoundsException err){
            System.out.println("Error is "+err);
        }
    }
}
