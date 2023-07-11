package logic;

import java.util.Scanner;

public class Convert {
//    Convert Decimal number format to Binary Octal And Hexa-Decimal

    public static int check(int no) {
        int sm = 0, rem = 0;
            for (int i = 1; i < no - 1; i++) {
                if (no % i == 0) {
                System.out.println(i);
                    sm += i;
                }
            }
            return sm;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number :");
        int no = s.nextInt();
        int sum = check(no);
        System.out.println("Sum of this-->" + sum);
    }

}
