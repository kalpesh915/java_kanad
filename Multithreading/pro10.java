public class pro10 {
    public static void main(String[] args) {
        TablePrinter tp1 = new TablePrinter( "Table 1", 10);
        TablePrinter tp2 = new TablePrinter( "Table 2", 15);
        TablePrinter tp3 = new TablePrinter( "Table 3", 20);

        try{
            tp1.setPriority(Thread.MAX_PRIORITY);
        }catch (Exception err){
            System.out.println("error is "+err);
        }
    }
}
