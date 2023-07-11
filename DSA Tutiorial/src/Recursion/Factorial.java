package Recursion;
import java.util.Scanner;
public class Factorial {
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        int SmallAns=fact(n-1);
        return n*SmallAns;
    }
    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
        System.out.print("Enter Number want to get Factorial ==>");
        int n=s.nextInt();
        
        int ans=fact(n);
        System.out.println("Factorial of "+n+" is "+ans );
    }
    
}
