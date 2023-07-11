/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Loops;

public class prime2 {

    public static void main(String[] args) {
        int n = 100, i, flag = 0;
        int store = 1;
        for (i = 3; i < n; i++) {
        int d=2;
//            for (j = 2; j < i; j++) {
            while(d<i){
                if (i % d == 0) {
                    break;
                }
                d++;
            }
//            }
            if (i == d) {
                System.out.println("prime\t" + i);
            }
        }

    }

}
