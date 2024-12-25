class Table{
    synchronized void printTable(int ip){
        for(int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (Exception err) {
                System.out.println("Error is " + err);
            }
            System.out.println(ip + " * " + i + " = "+(ip * i));
        }
    }
}

class Thread1 extends Thread{
    Table tbl;
    Thread1(Table tbl){
        this.tbl = tbl;
    }
    public void run(){
        tbl.printTable(5);
    }
}

class Thread2 extends Thread{
    Table tbl;
    Thread2(Table tbl){
        this.tbl = tbl;
    }
    public void run(){
        tbl.printTable(15);
    }
}

public class pro16 {
    public static void main(String[] args) {
        Table tbl = new Table();
        Thread1 t1 = new Thread1(tbl);
        Thread2 t2 = new Thread2(tbl);

        t1.start();
        t2.start();
    }
}
