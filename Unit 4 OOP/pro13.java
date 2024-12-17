class ThisReturnDemo{
    public ThisReturnDemo getObject(){
        return this;
    }

    public void printer(){
        System.out.println("This Return Demo Printer Method");
    }
}

public class pro13 {
    public static void main(String[] args) {
        ThisReturnDemo td1, td2;

        td1 = new ThisReturnDemo();

        td2 = td1.getObject();

        td2.printer();
    }
}
