// Write a program to find the sum of ASCII values of the first and last character of a given string.
// Note: Except alphabets, if the string has any other character including space, the output should be 1.

import java.util.Scanner;

public class Assignment5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input String : ");
        String str = sc.nextLine();
        sc.close();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            //can also use
            // if ((!str.equals("") && matches("^[a-zA-Z]*$"))
            if (((int) str.charAt(i) >= 65 && (int) str.charAt(i) <= 90)
                    || ((int) str.charAt(i) >= 97 && (int) str.charAt(i) <= 122) && (!str.equals(""))) {
                if (i == 0 || i == str.length() - 1) {
                    count = count + (int) str.charAt(i);

                }

            }
            //  else if (str.charAt(i) == ' ') {
            //     count = 1;
            //     break;
            // } 
            else {
                count = 1;
                break;
            }
        }
        System.out.print(count);

    }
}
