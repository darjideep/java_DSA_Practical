/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Loops;

import java.util.Scanner;

public class primecheck {

    public static void main(String[] args) {
        int d = 2;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Integer number would you want to check is prime or not->");
        int n = s.nextInt();
        int flag = 0;
        while (n > d) {
            if (n % d == 0) {
                flag = 1;
                break;
            }
            d++;
        }
        if (flag == 1) {
            System.out.println("NOT PRIME \t" + n);
        } else {
            System.out.println("prime \t" + n);
        }
    }
}
