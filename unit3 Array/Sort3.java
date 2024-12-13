/*
    Insertion Sort
*/

import java.util.Scanner;

public class Sort3 {
    public static void main(String[] args) {
        int size = 5, i, j, key;
        int ip[] = new int[size];

        Scanner scanner = new Scanner(System.in);

        for(i=0; i<size; i++){
            System.out.println("Enter any value for ip["+i+"]");
            ip[i] = scanner.nextInt();
        }

        // sorting process
        for(i=1; i<size; i++){
            key = ip[i];
            j = i - 1;

            while(j >= 0 && ip[j] > key){
                ip[j + 1] = ip[j];
                j--;
            }
            ip[j+1] = key;
        }


        // printer loop
        System.out.println("Sorted Values is ");
        for(int x : ip){
            System.out.print(" "+x);
        }
    }
}
