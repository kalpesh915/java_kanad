public class pro8 extends Thread{
    public static void main(String[] args) {
        Thread t1 = Thread.currentThread();
        System.out.println(t1);
        System.out.println(t1.isAlive());
    }
}
