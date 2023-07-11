package Arrays;

public class Ex3Check {

        public static int[] change(int input[]) {
            input[0] = 15;
            return input;
        }
  

    public static void main(String args[]) {
        int arr[] = new int[5];
        change(arr);
        System.out.println(arr[0]);
    }
    
    
    
    

}




