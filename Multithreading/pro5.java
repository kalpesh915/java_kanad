class ThreadDemo5 extends Thread{
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

public class pro5 {
    public static void main(String[] args) {
        ThreadDemo5 td1 = new ThreadDemo5();
        td1.run();
        td1.run();
    }
}
