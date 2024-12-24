class ThreadDemo4 implements Runnable{
    public void run(){
        for(int i = 1; i<=10; i++){
            System.out.println("Thread Name "+Thread.currentThread().getName()+" "+i);
            try{
                Thread.sleep(1000);
            }catch (Exception err){
                System.out.println("Error is "+err);
            }
        }
    }
}

public class pro4 {
    public static void main(String[] args) {
        ThreadDemo4 td1 = new ThreadDemo4();
        ThreadDemo4 td2 = new ThreadDemo4();

        Thread t1 = new Thread(td1, "Thread 1");
        Thread t2 = new Thread(td2, "Thread 2");

        t1.start(); // call run() of thread
        t2.start();

        t1.start();
    }
}
