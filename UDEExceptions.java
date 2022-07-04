public class UDEExceptions {
    public static void main(String[] args) {
        int i = -5;
        try {
            if (i < 0)
                throw new MyException("Nagative no.");
        } catch (MyException ex) {
            System.out.println("Caught Exception");
        } finally {
            System.out.println(i);
        }
    }
}
     class MyException extends Exception {
        public MyException(String s) {
            super(s);
        }
    }

