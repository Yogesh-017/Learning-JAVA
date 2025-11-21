package DSAsorting.sorting;

public class SelectionSort {
    static void select(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int MI = i;
            for (int j = i + 1; j < n; j++) {

                if (arr[j] < arr[MI]) {
                    MI = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[MI];
            arr[MI] = temp;
        }
    }

    public static void main(String args[]) {

        int[] arr = { 7, 4, 1, 2, 100, 90 };

        select(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}