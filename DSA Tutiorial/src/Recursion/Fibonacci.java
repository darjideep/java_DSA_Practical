package Recursion;

import static Extra.Factorial.fact;
import java.util.Scanner;

public class Fibonacci {

    public static int Fibonacci(int n){
        if(n==0 || n==1){
            return n;
        }
        int fibo=Fibonacci(n-1)+Fibonacci(n-2);
        return fibo;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Number want to get Fibonacci ==>");
        int n=s.nextInt();
        
        int ans=Fibonacci(n);
        System.out.println("Fibonacci of "+n+" is "+ans );
    }
    
}
