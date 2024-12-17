class StaticBlockDemo{
    static int ip1;

    static {
        ip1 = 100;
        System.out.println("Static Block Called");
    }

    StaticBlockDemo(){
        System.out.println("Constructor Called");
    }
}

public class pro10 {
    public static void main(String[] args) {
        //StaticBlockDemo sbd = new StaticBlockDemo();

        try {
            Class.forName("StaticBlockDemo");
        }catch (Exception err){
            System.out.println("Error is "+err);
        }

    }
}
