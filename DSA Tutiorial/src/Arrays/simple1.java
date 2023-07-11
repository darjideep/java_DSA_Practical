package Arrays;

import java.util.Scanner;
public class simple1 {
    

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Array Size :->");
        int n = sc.nextInt();
        int i;
        int arr[] = new int[n];
        
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (i = 0; i < n; i++) {
            System.out.println("Element " +i+" Entered "+ arr[i]);
        }
    }

}
