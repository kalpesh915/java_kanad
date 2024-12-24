public class pro9 {
    public static void main(String[] args) {
        TablePrinter tp1 = new TablePrinter( "Table 1", 10);
        TablePrinter tp2 = new TablePrinter( "Table 2", 15);

        tp1.start();
        tp2.start();
    }
}
