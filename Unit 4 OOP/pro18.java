class Calculator1{
    public void add(float i, float j){
        System.out.println("Sum is (f) "+(i+j));
    }
    public void add(int i, int j){
        System.out.println("Sum is (i) "+(i+j));
    }
    public void add(int i, int j, int k){
        System.out.println("Sum is "+(i+j+k));
    }
    public void add(int i, int j, int k, int l){
        System.out.println("Sum is "+(i+j+k+l));
    }
}

public class pro18 {
    public static void main(String[] args) {
        Calculator1 cal = new Calculator1();
        cal.add(11, 22);
        cal.add(11f, 22f);
        cal.add(11, 22, 33);
        cal.add(11, 22, 33, 44);
    }
}
