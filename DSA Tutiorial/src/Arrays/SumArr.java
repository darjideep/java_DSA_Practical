package Arrays;

import java.util.Scanner;

public class SumArr {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int ary[] = new int[n];
        for (int i = 0; i < n; i++) {
            ary[i] = sc.nextInt();

        }
      
        for (int i = 0; i < ary.length; i++) {
            System.out.println("Element " + i + " value " + ary[i]);
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+ary[i];
        }
        System.out.println("sum of Array is -->"+sum);

    }

}
