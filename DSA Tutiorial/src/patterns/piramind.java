//     1
//    1 2
//   1 2 3
//  1 2 3 4
package patterns;

import java.util.Scanner;

public class piramind {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Triangle =>");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int space = 1; space <= n - i; space++) {
                System.out.print(" ");
            }
            int j;
            int p = 1;
            for (j = 1; j <= i; j++) {
                System.out.print(p);
                p++;
            }
            p = i - 1;
            for (j = 1; j <= i - 1; j++) {
                System.out.print(p);
                p--;
            }
            System.out.println("");
        }
    }
}
