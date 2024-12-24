class ThreadDemo2 extends Thread{
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

public class pro2 {
    public static void main(String[] args) {
        ThreadDemo2 td = new ThreadDemo2();
        td.start();
    }
}
