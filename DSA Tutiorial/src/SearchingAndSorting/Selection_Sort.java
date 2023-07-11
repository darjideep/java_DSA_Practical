package SearchingAndSorting;

import java.util.Scanner;

public class Selection_Sort {

    public static int[] TakeElement() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Array Size :->");
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter " + i + " Position\t");
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    private static void Selection_Sort(int[] ary) {
        int Min = 0, Min_Index = 0;
        for (int i = 0; i <= ary.length - 1; i++) {
            Min = ary[i];
            Min_Index = i;

            for (int j = i + 1; j <= ary.length - 1; j++) {
                if (ary[j] < Min) {
                    Min = ary[j];
                    Min_Index = j;
                }
            }
            if (Min_Index != i) {
                ary[Min_Index] = ary[i];
                ary[i] = Min;
            }

        }
    }
public static void main(String[] args) {
        int ary[] = TakeElement();

        Selection_Sort(ary);
        for (int i = 0; i <= ary.length - 1; i++) {
            System.out.println("\n After Sorted " + ary[i]);
        }
    }

}
