/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package recursion;

public class factorial {
    
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        int SumAns=fact(n-1);
        return n*SumAns;
    }
    
    public static void main(String[] args){
        int n=3;
        int ans=fact(n);
        System.out.println(ans);
    }
}

