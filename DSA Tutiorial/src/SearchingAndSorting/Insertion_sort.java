
package SearchingAndSorting;

import java.util.Scanner;

public class Insertion_sort {
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

    public static void Insertion_sort(int arr[]){
        for(int i=0;i<arr.length;i++){    
            int temp=arr[i];
            int j;
            for(j=i-1;j>=0 && arr[j]>temp;j--){
                arr[j+1]=arr[j];
            }
            arr[j+1]=temp;
        }
    }
    public static void Display(int ary[]) {
        System.out.println("**********After Sorting Element**********");
        for (int i = 0; i <= ary.length - 1; i++) {
            System.out.print(ary[i]+ " ");
        }
    } 
    public static void main(String[] args) {
        int arr[]=MadeArray();
        Insertion_sort(arr);
        Display(arr);
       
    }
    
}
