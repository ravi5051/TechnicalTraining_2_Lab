public class ExceptionHandling {
    public static void main(String[] args){
        int a[]={10,0,2};
        int r=0,s=0;
        try{
            r=a[0]/a[3];
            s=a[0]/a[1];
        }
        catch(ArithmeticException e1){
            System.out.println(e1);
        }
        catch(ArrayIndexOutOfBoundsException e2){
            System.out.println(e2);
        }
            finally{
                System.out.println(r);
                System.out.println(s);
            }
    } 
}
