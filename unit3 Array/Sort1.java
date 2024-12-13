/*
    Bubble Sort
*/

import java.util.Scanner;

public class Sort1 {
    public static void main(String[] args) {
        int size = 5, i, j, tmp;
        int ip[] = new int[size];

        Scanner scanner = new Scanner(System.in);

        for(i=0; i<size; i++){
            System.out.println("Enter any value for ip["+i+"]");
            ip[i] = scanner.nextInt();
        }

        // sorting process
        for(i=0; i<size-1; i++){
            for(j=0; j<size-i-1; j++){
                if(ip[j] > ip[j+1]){
                    tmp = ip[j];
                    ip[j] = ip[j+1];
                    ip[j+1] = tmp;
                }
            }
        }


        // printer loop
        System.out.println("Sorted Values is ");
        for(int x : ip){
            System.out.print(" "+x);
        }
    }
}
