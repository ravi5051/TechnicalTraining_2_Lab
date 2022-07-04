// Write a java program to create 2D array in which perform the print operation in circular manner
// For example: if n = 5, then n*n = 25, hence the 2D array like that
// 1   2   3   4    5
// 6   7   8   9   10
// 11 12 13 14 15
// 16 17 18 19 20
// 21 22 23 24 25

// Output: 1 2 3 4 5 10 15 20 25 24 23 22 21 16 11 6 7 8 9 14 19 18 17 12 13

// Input: First line gives the size of the array
// Output:  Space separated numbers following circular pattern

import java.util.Scanner;
public class Assignment4 {
    void circular(int m) {
        int n = m;
        if (m == 5) {
            int a[][] = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 },{ 21, 22, 23, 24, 25 } };
            int i, k = 0, l = 0;
        while (k < m && l < n) {
            for (i = l; i < n; ++i) {
                System.out.print(a[k][i] + " ");
            }
            k++;
            for (i = k; i < m; ++i) {
                System.out.print(a[i][n - 1] + " ");
            }
            n--;
            if (k < m) {
                for (i = n - 1; i >= l; --i) {
                    System.out.print(a[m - 1][i] + " ");
                }
                m--;
            }
            if (l < n) {
                for (i = m - 1; i >= k; --i) {
                    System.out.print(a[i][l] + " ");
                }
                l++;
            }
        }
        }
        if (m == 4) {
            int a[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
            int i, k = 0, l = 0;
        while (k < m && l < n) {
            for (i = l; i < n; ++i) {
                System.out.print(a[k][i] + " ");
            }
            k++;
            for (i = k; i < m; ++i) {
                System.out.print(a[i][n - 1] + " ");
            }
            n--;
            if (k < m) {
                for (i = n - 1; i >= l; --i) {
                    System.out.print(a[m - 1][i] + " ");
                }
                m--;
            }
            if (l < n) {
                for (i = m - 1; i >= k; --i) {
                    System.out.print(a[i][l] + " ");
                }
                l++;
            }
        }
        }
    }
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        Assignment4 obj = new Assignment4();
        int m = sc.nextInt();
        sc.close();
        obj.circular(m);

    }
}
