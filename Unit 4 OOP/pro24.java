// final class FinalParent
class FinalParent{
    // final public void msg()
    public void msg(){
        System.out.println("Msg() Called from Parent Class");
    }
}

class FinalChild extends FinalParent{

    @Override
    public void msg(){
        System.out.println("Msg() Called from Child Class");
    }
}

public class pro24 {
    public static void main(String[] args) {
        FinalChild fc = new FinalChild();
        fc.msg();
    }
}
