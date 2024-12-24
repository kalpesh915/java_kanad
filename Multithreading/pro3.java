class ThreadDemo3 implements Runnable{
    public void run(){
        for(int i = 1; i<=10; i++){
            System.out.print(" "+i);
            try{
                Thread.sleep(1000);
            }catch (Exception err){
                System.out.println("Error is "+err);
            }
        }
    }
}

public class pro3 {
    public static void main(String[] args) {
        ThreadDemo3 td = new ThreadDemo3();
        Thread t1 = new Thread(td);
        t1.start(); // call run() of thread
    }
}
