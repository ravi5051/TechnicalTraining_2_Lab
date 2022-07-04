// Maya has scored few confidential numbers in an array(array of int). To ensure that others do not find the numbers easily, she has applied a simple encoding.
// Encoding used: Each array element has been substituted with a value that is the sum of original value and its succeeding element’s value.
// i.e. arr[i]= original value of arr[i]+original value of arr[i+1]
// e.g. value in arr[0]=original value of arr[0]+original value of arr[1]
// Also note that value of last element i.e. arr[last index] remains unchanged.
// For example,
// If the encoded array is { 7,6,8,16,12,3}
// The original array should have been {2,5,1,7,9,3}
// Provided the encoded array, you are expected to find the ---
// a.       First number (value in index 0) in the original array
// b.      Sum of all numbers in the original array
// Write the logic in the function findOriginalFirstAndSum(int[] input1, int input2);
// Where,
// Input1 represents the encoded array, and
// Input2 represents the number of elements in the array input1
// The method is expected to—
// ·         Find the value of the first number of the original array and store it in the member output1 and
// ·         Find the sum of all numbers in the original array and store it in the member output2
import java.util.Scanner;
public class Assignment6 {
    public static void findOriginalFirstAndSum(int[] input1, int input2) {
        int output1;
        int tmp[] = new int[input2];
        int j = input2-1;
        tmp[j] = input1[j];
        int output2 = tmp[j];
        for (int i = input2 - 2; i >= 0; i--) {
            tmp[i] = input1[i] - tmp[j];
            output2 += tmp[i];
            j--;
        }
        output1 = tmp[0];
        System.out.println(output1);
        System.out.println(output2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++)
            arr[i] = sc.nextInt();
        findOriginalFirstAndSum(arr, size);
        sc.close();
    }
}
