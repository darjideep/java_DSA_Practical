package SearchingAndSorting;

import java.util.Scanner;

class Searching {
    
    public static int BinarySearch(int[] ary, int SE) {
        int Start = 0, End = ary.length-1, Mid = 0;

        while (Start <= End) {

            Mid = (Start + End) / 2;

            if (SE == ary[Mid]) {
                return Mid;
            } else if (SE > ary[Mid]) {
                Start = Mid + 1;
                Mid = (Start + End) / 2;
            } else {
                End = Mid - 1;
                Mid = (Start + End) / 2;
            }
         }
        return -1;
    }

    public static void LinearSearch(int arr[], int search) {
        int flag = 0, i;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] == search) {
                flag = 1;
                break;
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
            System.out.print("Enter " + i + " position Value ");
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
        
        System.out.print("Which Element YOu Want To Search By LINEAR SEARCH ==>");
        int search = s.nextInt();
        obj.LinearSearch(arr, search);
        
        System.out.print("Which Element YOu Want To Search By BINARY SEARCH ==>");
        int Bsearch = s.nextInt();
        int BinarySearch = obj.BinarySearch(arr, Bsearch);
        System.out.println("Serched Element At Position ==>" + BinarySearch );
        
    }

}
