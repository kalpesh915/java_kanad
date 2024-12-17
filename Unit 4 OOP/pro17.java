class Calculator{
    public void add2(int i, int j){
        System.out.println("Sum is "+(i+j));
    }
    public void add3(int i, int j, int k){
        System.out.println("Sum is "+(i+j+k));
    }
    public void add4(int i, int j, int k, int l){
        System.out.println("Sum is "+(i+j+k+l));
    }
}

public class pro17 {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        cal.add2(11, 22);
        cal.add3(11, 22, 33);
        cal.add4(11, 22, 33, 44);
    }
}
