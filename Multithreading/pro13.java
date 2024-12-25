class ThreadGroupDemo extends Thread{
    public void run(){
        for(int i = 1; i<=10; i++){
            try{
                Thread.sleep(1000);
            }catch (Exception err){
                System.out.println("Error is "+err);
            }
            System.out.println("Thread is "+Thread.currentThread().getName()+" "+i);
        }
    }
}
public class pro13 {
    public static void main(String[] args) {
        ThreadGroupDemo tgd = new ThreadGroupDemo();
        ThreadGroup tg1 = new ThreadGroup("Sample Group");

        Thread t1 = new Thread(tg1, tgd, "Thread 1");
        Thread t2 = new Thread(tg1, tgd, "Thread 2");
        Thread t3 = new Thread(tg1, tgd, "Thread 3");
        Thread t4 = new Thread(tg1, tgd, "Thread 4");
        Thread t5 = new Thread(tg1, tgd, "Thread 5");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        //System.out.println("Thread Group is "+tg1);
        //System.out.println("Thread Group is "+tg1.activeCount());

        tg1.interrupt();
    }
}
