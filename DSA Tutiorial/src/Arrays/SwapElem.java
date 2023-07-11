package Arrays;

import java.util.Scanner;

public class SwapElem {

    public static int[] devArr() {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("\nEnter " + i + " Position value ->\t");
            arr[i] = s.nextInt();
        }
        return arr;
    }

    public static void Swap(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int temp[] = new int[1];
            arr[i] = temp[1];
            arr[i + 1] = arr[i];
            temp[1] = arr[i + 1];
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("\nElement " + i + " value " + arr[i]);
        }
    }

    public static void main(String[] args) {
        int ary[] = devArr();
        Swap(ary);

    }

}
