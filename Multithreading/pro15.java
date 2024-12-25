public class pro15 {
    public static void main(String[] args) {
        Runnable t1 = () -> {
            System.out.println("Thread is Running");
        };

        Thread thread = new Thread(t1);
        thread.start();
    }
}
