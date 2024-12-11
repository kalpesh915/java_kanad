import java.util.Scanner;

class Process5{
    public int sumofArray(int ip[]){
        int ans = 0;
        for(int tmp : ip){
            ans += tmp;
        }
        return ans;
    }

    public int[] getArray(){
        return new int[]{11, 22, 33, 44, 55, 66, 77, 99, 111};
    }
}
public class pro5 {
    public static void main(String[] args) {
        int ip[] = new int[10];
        Scanner sc = new Scanner(System.in);
        Process5 p5 = new Process5();
        int ans;

        for(int i=0; i<10; i++){
            System.out.println("Enter value for ip["+i+"]");
            ip[i] = sc.nextInt();
        }

        ans = p5.sumofArray(ip);
        System.out.println("Sum of Array is "+ans);
        ans = p5.sumofArray(new int[]{11, 22, 33, 44, 55});
        System.out.println("Sum of Array is "+ans);
        ans = p5.sumofArray(p5.getArray());
        System.out.println("Sum of Array is "+ans);
    }
}
