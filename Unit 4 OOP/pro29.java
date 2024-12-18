abstract class RBIBank{
    abstract public void ATM();
}

class SBIBank extends RBIBank{
    public void ATM(){
        System.out.println("ATM OF SBI");
    }
}

public class pro29 {
    public static void main(String[] args) {
        //RBIBank rbi = new RBIBank();
        SBIBank sbiBank = new SBIBank();
        sbiBank.ATM();
    }
}
