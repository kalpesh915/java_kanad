public class pro8 {
    public static void main(String[] args) {
        int data[][] = {{1,2,3}, {4,5,6}, {7,8,9}};

        for(int x[] : data){
            for(int tmp : x){
                System.out.print(" "+tmp);
            }
            System.out.println();
        }
    }
}