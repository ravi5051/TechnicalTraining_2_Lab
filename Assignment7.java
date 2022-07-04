// Calculate sum of non-prime index values in an array:
import java.util.Scanner;
import java.lang.Math;

public class Assignment7 {
    public static boolean nonPrime(int n){
        if(n<=1)
        return true;
            else if(n==2)
            return false;
            else{
                for(int i=2;i<=Math.sqrt(n);i++){
                    if(n%i==0){
                    return true;
                    }
                }
            return false;
            }
        }
        

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++)
            arr[i] = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < size; i++) {
            if (nonPrime(i))
                sum = sum + arr[i];
        }
        System.out.print(sum);
        sc.close();
    }
}