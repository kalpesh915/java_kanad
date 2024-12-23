class Calculation1{
    public void div(int ip1, int ip2){
        if(ip2 == 0){
            throw new ArithmeticException("Division is Not Possible");
        }else{
            System.out.println("Divison is "+(ip1 / ip2));
        }
    }
}

public class pro11 {
    public static void main(String[] args) {
        Calculation1 cal1 = new Calculation1();
        try{
            cal1.div(111, 0);
        }catch (ArithmeticException err){
            System.out.println("Error is "+err);
        }

    }
}
