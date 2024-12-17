class ThisDemo1{
    int ip1, ip2;

    ThisDemo1(){
        System.out.println("Default Constructor Called");
    }

    public ThisDemo1(int ip1, int ip2) {
        this();
        this.ip1 = ip1;
        this.ip2 = ip2;
        //printer();
        this.printer();

    }

    public void printer(){
        System.out.println("ip1 is "+ip1+" ip2 is "+ip2);
    }
}

public class pro12 {
    public static void main(String[] args) {
        ThisDemo1 td1 = new ThisDemo1(11, 22);
        //td1.printer();
    }
}
