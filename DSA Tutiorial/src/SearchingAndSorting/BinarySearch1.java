package SearchingAndSorting;

import java.util.Scanner;

public class BinarySearch1 {

    public static int[] TakeElement() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Array Size :->");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Allways Enter Element in Assending order :\n");
        for (int i = 0; i < n; i++) {
            System.out.println("Enter "+ i + " Position\t");
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    private static int BinarySearch(int[] ary, int SE) {
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

    public static void main(String[] args) {
        int ary[] = TakeElement();
        Scanner sc = new Scanner(System.in);
        System.out.print("\n Enter Element you want to Search :->");
        int s = sc.nextInt();
        int result = BinarySearch(ary, s);
        System.out.println("Searched Element Position-->" + (result+1) );
    }

}
