import java.util.Scanner;
class matrix{
    int a[][]=new int[3][3];
    int b[][]=new int[3][3];
    int c[][]=new int[3][3];
public void getMatrix()
{
    Scanner input=new Scanner(System.in);
    System.out.println("Enter Elements of the First Matrix :");
    for(int i=0;i<3;i++)
    {
        for(int j=0;j<3;j++)
        a[i][j]=input.nextInt();
    }
    System.out.println("Enter Elements of the Second Matrix :");
    for(int i=0;i<3;i++)
    {
        for(int j=0;j<3;j++)
        b[i][j]=input.nextInt();
    }
    
    input.close();
} 
public void addMatrix()
{
    for(int i=0;i<3;i++)
    {
        for(int j=0;j<3;j++)
        c[i][j]=a[i][j]+b[i][j];
    }
}  
public void subtractMatrix()
{
    for(int i=0;i<3;i++)
    {
        for(int j=0;j<3;j++)
        c[i][j]=a[i][j]-b[i][j];
    }
}  
public void multiply()
{
    for(int i=0;i<3;i++)
    {
        for(int j=0;j<3;j++)
        {
            c[i][j]=0;
            for(int k=0;k<3;k++)
            c[i][j]=c[i][j]+(a[i][k]*b[k][j]);
        }
    }
}
public void displayTranspose()
{
    for(int i=0;i<3;i++)
    {
        for(int j=0;j<3;j++)
        System.out.print(c[j][i]+"\t");
        System.out.print("\n");
    }
}
public void display()
{
    for(int i=0;i<3;i++)
    {
        for(int j=0;j<3;j++)
        System.out.print(c[i][j]+"\t");
        System.out.print("\n");
    }
}
};

public class operationsOnMatrics{
    public static void main(String args[]) {
        matrix obj=new matrix();
        obj.getMatrix();
        System.out.println("After Addition :");
        obj.addMatrix();
        obj.display();
        System.out.println("After subtraction :");
        obj.subtractMatrix();
        obj.display();
        System.out.println("After Multipliaction :");
        obj.multiply();
        obj.display();
        System.out.println("Tranpose Matrix :");
        obj.displayTranspose();
    }
}