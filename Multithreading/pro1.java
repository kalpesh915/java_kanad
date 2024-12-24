public class pro1 {
    public static void main(String[] args) {
        Thread t1 = new Thread("Sample Thread");
        System.out.println(t1);

        for(int i=1; i<=10; i++){
            System.out.print(" "+i);
        }
    }
}
