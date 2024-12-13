/*
    Selection Sort
*/

import java.util.Scanner;

public class Sort2 {
    public static void main(String[] args) {
        int size = 5, i, j, tmp, min;
        int ip[] = new int[size];

        Scanner scanner = new Scanner(System.in);

        for(i=0; i<size; i++){
            System.out.println("Enter any value for ip["+i+"]");
            ip[i] = scanner.nextInt();
        }

        // sorting process
        for(i=0; i<size-1; i++){
            min = i;
            for(j=i+1; j<size; j++){
                if(ip[min] > ip[j]){
                    min = j;
                }
            }
            tmp = ip[i];
            ip[i] = ip[min];
            ip[min] = tmp;
        }


        // printer loop
        System.out.println("Sorted Values is ");
        for(int x : ip){
            System.out.print(" "+x);
        }
    }
}
