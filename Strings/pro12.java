public class pro12 {
    public static void main(String[] args) {
        StringBuffer ip1 = new StringBuffer("Kanad");

        long startTime = System.currentTimeMillis();
        for(int i = 1; i<= 1000000; i++){
            ip1.append("Joshi");
        }
        System.out.println("End Time "+(System.currentTimeMillis()-startTime) );
    }
}
