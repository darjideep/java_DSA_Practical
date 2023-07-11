/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Generics;

public class GenericFunction {
    public static<T> void Bubblesort(T arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        Integer arr[]={5,3,6,7,2};
        Bubblesort(arr);
        
        String ar[]={"Deep","Meet","Yash","Jaymin"};
        Bubblesort(ar);
    }
    
}
