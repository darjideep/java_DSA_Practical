/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package SearchingAndSorting;

import java.util.Scanner;

public class Bubble_sort {
    public static void Bubble_sort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    
    public static int[] MadeArray(){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Array Size ==>");
        int n = s.nextInt(); 
        int arr[] = new int[n];
        for (int i = 0; i <= arr.length-1; i++) {
            System.out.print("Enter " + i + " Position Value => ");
            arr[i]=s.nextInt();
        }
        return arr;
    }
//    public static void Bubble_sort(int arr[]){
//        for(int i=0;i<arr.length-1;i++){
//            for(int j=i;j<arr.length-1;j++){
//                if(arr[j]>arr[j+1]){
//                    int temp=arr[j];
//                    arr[j]=arr[j+1];
//                    arr[j+1]=temp;
//                }
//            }
//        }
//        
//    }
    
    public static void Display(int ary[]) {
        System.out.println("**********After Sorting Element**********");
        for (int i = 0; i <= ary.length - 1; i++) {
            System.out.print(ary[i]+ " ");
        }
    }
    
    public static void main(String[] args) {
        int arr[]=MadeArray();
        Bubble_sort(arr);
        Display(arr);
    }
    
}
