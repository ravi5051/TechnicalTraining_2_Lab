import java.util.Scanner;
class OperationInCircular {
    void circular(int x){
        int num=1;
        // int temp1,temp2,tmp;
        int j=0;
        int i=0;
        while(i<x){
            while(j<x)
            {
                System.out.print(num++); 
                j++;
            }
            /*
            00 01 02 03 04 
            10 11 12 13 14
            20 21 22 23 24
            30 31 32 33 34
            40 41 42 43 44
            */
            j--;
            
        }   
    }
    public static void main(String[] args){
        OperationInCircular obj=new OperationInCircular();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        obj.circular(n);
    }
}
