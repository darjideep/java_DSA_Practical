package Arrays;

public class Ex2Check {

    public static void main(String[] args) {
        
        int[] arr = new int[5];
        System.out.println("Before Array lenght ==> "+arr.length);
        arr = new int[6];
        arr[5]=8;

        System.out.println("After Increase Array lenght ==> "+arr.length);
        System.out.println("Element Value=> "+arr[5]);
    }

}
