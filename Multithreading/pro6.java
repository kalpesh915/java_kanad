class ThreadDemo6 extends Thread{
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

public class pro6 {
    public static void main(String[] args) {
        ThreadDemo6 td1 = new ThreadDemo6();
        td1.start();

        try {
            //td1.join();
            td1.join(5000);
        }catch (Exception err){
            System.out.println("Error is "+err);
        }

        for(int i = 1; i<=10; i++){
            System.out.print(" Main "+i);
        }
        System.out.println("Main Thread Completed");
    }
}
