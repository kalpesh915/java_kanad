import calculations.Math1;

class Runner extends Math1{
    public void sumRunner(){
        sum(11, 22);
    }
}

public class pro35 {
    public static void main(String[] args) {
//        Math1 m1 = new Math1();
//        calculations.Math3 m3 = new calculations.Math3();
//
//        m1.sum(111, 22);
//        m1.sub(111, 22);

        Runner runner = new Runner();
        runner.sumRunner();
        // runner.sum(11, 22);
    }
}
