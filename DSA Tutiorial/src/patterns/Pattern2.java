/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package patterns;

import java.util.Scanner;

/**
 *
 * @author Deep
 */
public class Pattern2 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row size =>");
        int r=sc.nextInt();
        System.out.println("Enter column size =>");
        int c=sc.nextInt();
        for(int i=1;i<=r;i++){
            for(int j=1;j<=c;j++)
            {
                
//                System.out.print(i);    
                //111
                //222
                
//                System.out.print(j);    
                //123
                //123
                
                System.out.print((c-j)+1);
                //r=5,c=5
                //54321
                //54321
                
                
            }
            System.out.println();
        }
    }
    
}
