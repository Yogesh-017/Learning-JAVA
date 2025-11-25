package DSAsorting.sorting;

public class quickSort {

    static void swap(int arr[], int x, int y) {

        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    static int partition(int arr[], int st, int end) {

        int pivot = arr[st];
        int cnt = 0;

        for (int i = st + 1; i <= end; i++) {

            if (arr[i] <= pivot)
                cnt++;
        }
        int PI = st + cnt;

        swap(arr, st, PI);

        int i = st, j = end;

        while (i < PI && j > PI) {

            while (arr[i] <= pivot)
                i++;
            while (arr[j] > pivot)
                j--;

            if (i < PI && j > PI) {
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        return PI;

    }

    static void quicks(int arr[], int st, int end) {
        if (st >= end)
            return;

        int piv = partition(arr, st, end);
        quicks(arr, st, piv - 1);
        quicks(arr, piv + 1, end);

    }

    public static void main(String arrgs[]) {

        int arr[] = { 2, 5, 8, 6, 4, 5, 5, 6 };
        int n = arr.length;

        quicks(arr, 0, n - 1);

        for (int k : arr) {
            System.out.print(k + " ");
        }
    }
}
