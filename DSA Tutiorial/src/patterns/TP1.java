package patterns;

import java.util.Scanner;

/**
 *
 * @author Deep
 */
public class TP1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size =>");
        int n = sc.nextInt();
//                n=4
        int counter = 1;

        for (int i = 1; i <= n; i++) {
//        int startNo = i;
            for (int j = 1; j <= i; j++) {

//                System.out.print(i);
//                1
//                22
//                333
//                4444
//                System.out.print(j);
//                1
//                12
//                123
//                1234
                
                
//                2 logic Same Nut Diff way to write
//  no1              System.out.print(i + j - 1);
                
//  no2              System.out.print(startNo);
//                startNo++;
//                1
//                23
//                345
//                4567

//                System.out.print(i-j+1);
                //1
                //21
                //321
                //4321



                System.out.print(counter);
                counter++;

            }
            
            System.out.println();
        }

    }

}
