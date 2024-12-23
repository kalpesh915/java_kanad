class Calculation2{
    public void division(int ip1, int ip2) throws ArithmeticException{
        System.out.println("Division is "+(ip1 / ip2));
    }
}

public class pro13 {
    public static void main(String[] args)  {
        Calculation2 c2 = new Calculation2();
        try{
            c2.division(122, 0);
        }catch (ArithmeticException e){
            System.out.println("Error is "+e);
        }
    }
}
