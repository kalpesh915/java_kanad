public class TablePrinter extends  Thread{
    Thread t;
    String name;
    int ip;

    TablePrinter( String name, int ip){
        this.t = new Thread(this, name);
        this.ip = ip;
        System.out.println("New Thread Created "+t.getName());
        t.start();
    }

    public void run(){
        for(int i = 1; i <= 10; i++){
            System.out.println("Thread : "+t.getName()+" Table = "+ip+" * "+i+" : "+(ip* i));
            try{
                t.sleep(1000);
            }catch (Exception err){
                System.out.println("Error is "+err);
            }
        }
    }
}
