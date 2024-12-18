class Bike{
    int topSpeed;

    static {
        System.out.println("Static Block Called");
        // class loading
    }

    {
        topSpeed = 100;
        System.out.println("Instance Initlization Block");
    }

     Bike(){
         System.out.println("Bike Constructor Called");
     }

    Bike(int i){
        System.out.println("Bike Constructor Called with int");
    }
}
public class pro22 {
    public static void main(String[] args) {
        Bike bike = new Bike();
        Bike bike1 = new Bike(1);
        try{
            Class.forName("Bike");
        }catch (Exception err){
            System.out.println("Error "+err);
        }
    }
}
