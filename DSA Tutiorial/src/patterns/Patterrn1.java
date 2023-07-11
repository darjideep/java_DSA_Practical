
package patterns;

import java.util.Scanner;


public class Patterrn1 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row size =>");
        int r=sc.nextInt();
        System.out.println("Enter column size =>");
        int c=sc.nextInt();
        for(int i=1;i<=r;i++){
            for(int j=1;j<=c;j++)
            {
                System.out.print("*");
            }
            System.out.println("\n");
        }
    }
    
}
