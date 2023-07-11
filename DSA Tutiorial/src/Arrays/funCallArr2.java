package Arrays;

import java.util.Scanner;
public class funCallArr2 {

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

    public static void FindArr(int arr[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Element you want to search :->");
        int find = sc.nextInt();
        int len = arr.length;
        int i;
        for (i = 0; i < len; i++) {
            if (find == i) {
                break;
            }
        }
        System.out.println("\n Serched Element " + find + " At Position " + i);
    }

    public static void main(String[] args) {

        int arr[] = TakeElement();
        Display(arr);
        FindArr(arr);
//        System.out.println(arr);
    }
}
