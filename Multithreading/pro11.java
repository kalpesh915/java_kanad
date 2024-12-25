class DaemonThreadExample extends Thread{
    public void run(){
        if(Thread.currentThread().isDaemon()){
            System.out.println("Thread is Daemon Thread");
        }else{
            System.out.println("Thread is User Thread");
        }
    }
}
public class pro11 {
    public static void main(String[] args) {
        DaemonThreadExample d1 = new DaemonThreadExample();
        DaemonThreadExample d2 = new DaemonThreadExample();
        DaemonThreadExample d3 = new DaemonThreadExample();

        d1.setDaemon(true);
        d1.start();
        d2.start();
        d3.start();
    }
}