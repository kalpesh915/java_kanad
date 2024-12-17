class RBI{
    int zip = 101;
    public float getRateofInterest(){
        System.out.println("Ask to Specific Bank");
        return 0;
    }
}

class SBI extends RBI{
    int zip = 102;
    @Override
    public float getRateofInterest() {
        return 9.5f;
    }
}

class AXIS extends RBI{
    int zip = 103;
    @Override
    public float getRateofInterest() {
        return 11.5f;
    }
}

class ICICI extends RBI{
    int zip = 104;
    @Override
    public float getRateofInterest() {
        return 10.5f;
    }
}

public class pro19 {
    public static void main(String[] args) {
        RBI rbi;

        rbi = new SBI();
        System.out.println("Rate of Interest in SBI "+rbi.getRateofInterest());
        rbi = new AXIS();
        System.out.println("Rate of Interest in AXIS "+rbi.getRateofInterest());
        rbi = new ICICI();
        System.out.println("Rate of Interest in ICICI "+rbi.getRateofInterest());
        System.out.println(rbi.zip);
    }
}
