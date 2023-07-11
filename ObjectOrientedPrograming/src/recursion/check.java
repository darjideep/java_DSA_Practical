/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package recursion;

public class check {
    public static void print(int n){
		if(n < 0){
			return;
		}
		if(n == 0){
			System.out.println(n);
			return ;
		}
		print(n--);
		System.out.print(n+" ");
	}
	
	public static void main(String[] args) {
		int num = 3;
		print(num);
	}
}
