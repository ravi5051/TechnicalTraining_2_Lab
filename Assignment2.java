// Find factorial of any given number
import java.util.Scanner;
public class Assignment2 {
    int factorial(int x)
    {
        int fact=1;
        if(x<0)
        return 0;
        else if(x==0)
        return fact;
        else
        {
            while(x>0)
            {
                fact=fact*x;
                x--;
            }
            return fact;
        }
    }
    public static void main(String args[])
    {
        Assignment2 obj=new Assignment2();
        Scanner input=new Scanner(System.in);
        int num;
        System.out.print("Enter a Number : ");
        num=input.nextInt();
        input.close();
        System.out.println("Factorial of "+num+" is "+obj.factorial(num));
    }
}
