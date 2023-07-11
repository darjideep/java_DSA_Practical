package Arrays;

import java.util.Scanner;

public class SumArrFun {
    
    public static int[] devArr(){
        Scanner s=new Scanner(System.in);
        System.out.print("\n Enter Array Size= ");
        int size=s.nextInt();
       int ary[]=new int[size];
       for (int i = 0; i < size; i++) {
            System.out.print("\nEnter "+i+" Position value ->\t");
            ary[i] = s.nextInt();
        }
       return ary;
    }
    
    public static void Display(int[] ary){
        int sum=0;
        for (int i = 0; i < ary.length; i++) {
            System.out.println("\nElement " + i + " value " + ary[i]);
        }
        for(int i=0;i<ary.length;i++){
            sum=sum+ary[i];
        }
        System.out.println("\n Sum of Array is -->"+sum);
    }
    
    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        System.out.print("How Many Array Want's to Create:");
        int n=s.nextInt();
        for(int i=0;i<n;i++){
           int ret[]= devArr();
           Display(ret);
        }
    }
}
