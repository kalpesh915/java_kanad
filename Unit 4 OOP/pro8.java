class Calculation{
    Calculation(int i){
        System.out.println("Integer Called");
    }

    Calculation(float i){
        System.out.println("Float Called");
    }
}
public class pro8 {
    public static void main(String[] args) {
        Calculation c = new Calculation(11);
    }
}
