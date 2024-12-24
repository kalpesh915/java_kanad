class ThreadDemo7 extends Thread{
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

public class pro7 {
    public static void main(String[] args) {
        ThreadDemo7 td1 = new ThreadDemo7();
        System.out.println(td1.getName());
        td1.setName("Thread 112");
        System.out.println(td1.getName());
        System.out.println(td1.getId());
        System.out.println(td1.threadId());
    }
}
