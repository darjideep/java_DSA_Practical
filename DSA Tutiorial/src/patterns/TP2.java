/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package patterns;


import java.util.Scanner;

public class TP2 {

    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.print("Enter Size =>");
        int n=sc.nextInt();
        
        for(int i=1;i<=n;i++){
            char strch=(char)('A'+ i -1);
            for(int j=1;j<=n;j++){
//                char strch=(char)('A'+ j -1);
                System.out.print(strch);
                strch++;
              }
            System.out.println();
        }
    }
    
}
//N=5
//ABCDE
//BCDEF
//CDEFG
//DEFGH
//EFGHI


//WHEN USE J<=I SO PRIT TRIANGLE

//AND USE ==>char strch=(char)('A'+ J -1);  
//INSIDE THE J FOR LOOP and not increment value of strch var
//ABCDE
//ABCDE
//ABCDE
//ABCDE
//ABCDE