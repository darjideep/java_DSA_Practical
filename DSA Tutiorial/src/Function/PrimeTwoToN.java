package Function;

import java.util.Scanner;

public class PrimeTwoToN {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Limit which you want to find prime :=>");
        int n = s.nextInt();
        AllPrime(n);
    }

    private static void AllPrime(int n) {
        for (int i = 2; i <= n; i++) {
            boolean IsPrime = CheckPrime(i);
            if (IsPrime==true) {
                System.out.println(i);
            }
        }

    }

    private static boolean CheckPrime(int i) {
        int d = 2;
        while (i > d) {
            if (i % d == 0) {
                return false;
            }
            d++;
        }
        return true;
    }

}
