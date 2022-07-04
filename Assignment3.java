// Write a java program in which you have an n-by-n matrix of 0’s and 1’s where all 1’s in each row originate before or after all 0’s, Discovery the utmost efficient technique to return the row with the maximum number of 1's.
import java.util.Scanner;
public class Assignment3 {
    public static void main(String args[]) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Value of n : ");
        n = sc.nextInt();
        int arr[][] = new int[n][n];
        System.out.println("Enter " + n * n + " elements");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();
        int max = 0;
        int tmp=9; 
        int i;
        for (i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 1) {
                    count++; 
                }
            }
            if (max < count) {
                max = count;
                tmp = i;
            }
        }
        System.out.println("Maximum number of 1's is present in n no." + (tmp+1));

    }
}
