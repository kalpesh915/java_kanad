class Design{
    public void pattern(){
        System.out.println("*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_");
    }
}
class Math1 extends Design{
    public void sum(int i, int j){
        System.out.println("Sum is "+(i+j));
        pattern();
    }

    public void sub(int i, int j){
        System.out.println("Sub is "+(i-j));
        pattern();
    }
}

class Math2 extends Design{
    public void div(int i, int j){
        System.out.println("Div is "+(i/j));
        pattern();
    }

    public void mul(int i, int j){
        System.out.println("Mul is "+(i*j));
        pattern();
    }
}

class Math3 extends Design{
    public void mod(int i, int j){
        System.out.println("Mod is "+(i%j));
        pattern();
    }
}

public class pro14 {
    public static void main(String[] args) {
        Math1 m1 = new Math1();
        Math2 m2 = new Math2();
        Math3 m3 = new Math3();

        m1.sum(111, 22);
        m1.sub(111, 22);

        m2.div(111, 22);
        m2.mul(111, 22);

        m3.mod(111, 22);
    }
}
