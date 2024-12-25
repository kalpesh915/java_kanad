import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class pro12 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        for(int i = 1; i<=10; i++){
            TablePrinter tp = new TablePrinter("Thread "+i, i);
            executorService.execute(tp);
        }

        executorService.shutdown();
    }
}
