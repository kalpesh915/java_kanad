class FinalDemo{
    //final int ip;
    int ip;

    public void setIP(int ip){
        this.ip = ip;
    }

    public int getIP(){
        return ip;
    }
}

public class pro23 {
    public static void main(String[] args) {
        FinalDemo fd = new FinalDemo();
        fd.setIP(100);
        System.out.println(fd.getIP());
    }
}
