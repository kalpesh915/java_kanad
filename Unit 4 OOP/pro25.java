class FinalVariable{
    //static final int ip;
    final int ip;

//    static {
//        ip = 1000;
//    }

    FinalVariable(){
        ip = 100;
    }

    public void printer(){
        System.out.println("Value of ip is "+ip);
    }
}

public class pro25 {
    public static void main(String[] args) {
        FinalVariable fv = new FinalVariable();
        fv.printer();
    }
}
