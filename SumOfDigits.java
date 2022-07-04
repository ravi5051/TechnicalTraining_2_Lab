// The sum of a given integer is the sum of all its digits (e.g. the digit sum of 84001 is calculated as 8+4+0+0+1 = 13).
import java.util.Scanner;
public class SumOfDigits {
     int sumDGT(int x){
        int r;
        int sum=0;
        while(x>0){
            r=x%10;
            sum=sum+r;
            x=x/10;
        }
        return sum;
    }
    public static void main(String[] args){
        SumOfDigits obj=new SumOfDigits();
        Scanner input=new Scanner(System.in);
        int num;
        System.out.print("Enter a Number : ");
        num=input.nextInt();
        input.close();
        System.out.println("Sum of Digits of "+num+" is "+obj.sumDGT(num));
    }
}
