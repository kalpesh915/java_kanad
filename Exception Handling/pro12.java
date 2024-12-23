class ExceptionPropogation{
    public void method1(){
        method2();
    }
    public void method2(){
        method3();
    }
    public void method3(){
        method4();
    }
    public void method4(){
        method5();
    }
    public void method5(){
        throw new ArithmeticException("Error Propogation");
    }
}
public class pro12 {
    public static void main(String[] args) {
        ExceptionPropogation ep = new ExceptionPropogation();
        //ep.method1();
        try {
            ep.method1();
        }catch (ArithmeticException e){
            System.out.println("Error is "+e);
            //e.printStackTrace();
        }
    }
}
