package Array2D;

import java.util.Scanner;

public class RowWiseSum {

    public static int[][] TakeElement() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Rows :->");
        int r = sc.nextInt();
        System.out.print("\n Enter Number of Cols :->");
        int c = sc.nextInt();
        int arr[][] = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
            System.out.println("\n");
        }

        return arr;
    }

    public static void display(int[][] ary) {
        int r = ary.length;
        int c = ary[0].length;

        System.out.println("Display Array");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(ary[i][j] + "  ");
            }
            System.out.println("\n");
        }
    }

    public static void sumOfRows(int[][] ary) {
        int largest = Integer.MIN_VALUE;
        int r = ary.length;
        int c = ary[0].length;
        System.out.println("Row Wise Sum  :) \n");
        for (int i = 0; i < r; i++) {
            int sum = 0;
            for (int j = 0; j < c; j++) {
                sum = sum + ary[i][j];
            }
            if (sum > largest) {
                largest = sum;
            }
            System.out.print("Sum Of " + (i + 1) + " Row " + sum);
            System.out.println("\n");
        }
        System.out.println("Largest Sum Of Rows => \n\n" + largest);
    }

    public static void sumOfCols(int[][] ary) {
        int largest = Integer.MIN_VALUE;
        int r = ary.length;
        int c = ary[0].length;
        int i = 0;
        System.out.println("Col Wise Sum  :) \n");
        for (int j = 0; j < c; j++) {
            int sum = 0;
            for (i = 0; i < r; i++) {
                sum = sum + ary[i][j];
            }
            if (sum > largest) {
                largest = sum;
            }
            System.out.print("Sum Of " + (j + 1) + " Col " + sum);
            System.out.println("\n");
        }

        System.out.println("Largest Sum Of Cols =>" + largest);
    }

    public static void main(String[] args) {
        int ary[][] = TakeElement();
        display(ary);
        sumOfRows(ary);
        sumOfCols(ary);
    }
}
