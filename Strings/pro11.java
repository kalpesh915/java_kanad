public class pro11 {
    public static void main(String[] args) {
        String ip1 = "Kanad";

        long startTime = System.currentTimeMillis();
        for(int i = 1; i<= 1000000; i++){
            ip1 = ip1 + "Joshi";
        }
        System.out.println("End Time "+(System.currentTimeMillis()-startTime) / 1000);
    }
}
