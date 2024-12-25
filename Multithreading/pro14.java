public class pro14 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread is Running");
            }
        });

        t1.start();
    }
}
