public class pro7 {
    public static void main(String[] args) {
        int data1[][];
        int[][] data2;
        int [][]data3;

        int data4[][] = {{1,2,3}, {4,5,6}, {7,8,9}};

        for(int i = 0; i<data4.length; i++){
            for(int j = 0; j<data4[i].length; j++){
                System.out.print(" "+data4[i][j]);
            }
            System.out.println();
        }
    }
}
