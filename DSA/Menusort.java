package DSAsorting;

import java.util.*;

public class Menusort {
    static void bubble(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            boolean flag = false;
            for (int j = 0; j < n - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;
                }
            }
            if (!flag) {
                return;
            }
        }
    }

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

    static void insert(int arr[]) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int j = i;
            while (j > 0 && arr[j] < arr[j - 1]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 5, 4, 3, 2, 1 };
        System.out.println("1: to bubble sort: ");
        System.out.println("2: to selection sort: ");
        System.out.println("3: to insertion sort: ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                bubble(arr);
                for (int k : arr) {
                    System.out.print(" " + k);
                    break;
                }
            case 2:
                select(arr);
                for (int k : arr) {
                    System.out.print(" " + k);

                }
                break;
            case 3:
                insert(arr);
                for (int i : arr) {
                    System.out.print(" " + i);
                }
                break;
            default:
                System.out.println("invalid choice");

        }
        sc.close();
    }
}
