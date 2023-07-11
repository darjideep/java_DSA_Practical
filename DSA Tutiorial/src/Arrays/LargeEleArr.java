
package Arrays;

import java.util.Scanner;


public class LargeEleArr {
      public static int[] TakeElement() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Array Size :->");
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void Display(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.println("Element " + i + " Entered " + arr[i]);
        }

    }
    private static int LargeElement(int[] arr) {
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
   

    public static void main(String[] args) {

        int arr[] = TakeElement();
        Display(arr);
        int large=LargeElement(arr);
        System.out.println("\n \nThe Largest Element Is ->"+large);
    }

    
}
