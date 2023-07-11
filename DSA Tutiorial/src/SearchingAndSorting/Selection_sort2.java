package SearchingAndSorting;

import java.util.Scanner;

public class Selection_sort2 {

    public static int[] TakeEle() {
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

    public static void Display(int ary[]) {
        System.out.println("**********After Sorting Element**********");
        for (int i = 0; i <= ary.length - 1; i++) {
            System.out.print(ary[i]+ " ");
        }
    }
    
    public static void Selection_sort(int arr[]){
        for(int i=0;i<arr.length;i++){
            int min=arr[i];
            int min_index=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<min){
                    min=arr[j];
                    min_index=j;
                }
            }
            if (min_index!=i){
                arr[min_index]=arr[i];
                arr[i]=min;
            }
        }
        
    } 

    public static void main(String[] args) {
        int ar[]=TakeEle();
        
        Selection_sort(ar);
        Display(ar);
        
    }

}
