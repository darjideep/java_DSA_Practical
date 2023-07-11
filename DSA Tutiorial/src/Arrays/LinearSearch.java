package Arrays;

import SearchingAndSorting.*;
import java.util.Scanner;

class Searching {

    public static void LinearSearch(int arr[], int search) {
        int flag = 0, i;
        for (i = 1; i < arr.length; i++) {
            if (arr[i] == search) {
                flag = 1;
            }
        }
        if (flag == 1) {
            System.out.println("Element Find Succesfully==>" + search + " At Position " + i);
        } else {
            System.out.println("Element Not Found" + search);
        }
    }

    public static int[] MakeArray(int n) {
        int ar[] = new int[n];
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < ar.length; i++) {
            System.out.print("Enter " + (i + 1) + " position Value ");
            ar[i] = s.nextInt();
        }
        return ar;
    }

    public static void DisplayArray(int ar[]) {
        for (int i = 0; i < ar.length; i++) {
            System.out.print(" " + ar[i] + " ");
        }
    }

}

public class LinearSearch {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Array Size ==>");
        int n = s.nextInt();
        Searching obj = new Searching();
        int arr[] = obj.MakeArray(n);
        obj.DisplayArray(arr);
        System.out.print("Which Element YOu Want To Search ==>");
        int search = s.nextInt();
        obj.LinearSearch(arr, search);

    }

}
