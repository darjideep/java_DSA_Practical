package Extra;

import java.util.Scanner;

public class Fibonacci {

    public static void fibo(int n) {
        int no1 = 0, no2 = 1, counter = 0;
        while (counter < n) {
            System.out.println(no1 + " ");
            //Swap
            int no3 = no2 + no1;
            no1 = no2;
            no2 = no3;
            counter++;
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Number want to get Fibonacci ==>");
        int n = s.nextInt();
        fibo(n);
    }
}
