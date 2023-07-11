package Extra;

public class Sorting {

    public static void is(int arr[]) {
        int n = arr.length, i;
        for (i = 0; i < n; i++) {
            int temp = arr[i];
            int j;
            for (j = i - 1; j >= 0 && arr[j] > temp; j--) {
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = temp;
        }

        System.out.println("Sourting By Insertion Sort");
        for (i = 0; i < n; i++) {
            System.out.println("Array After sorted ==>" + arr[i]);
        }
    }

    public static void bs(int arr[]) {
        int n = arr.length - 1, temp, i;
        for (i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("Sourting By Bubble Sort");
        for (i = 0; i < n; i++) {
            System.out.println("Array After sorted ==>" + arr[i]);
        }

    }

    public static void main(String[] args) {
        int arr[] = {6, 3, 7, 9, 2, 8, 1};
        bs(arr);
        is(arr);
    }

}
