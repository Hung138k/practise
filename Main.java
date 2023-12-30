package TestC;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] a = {1, 2, 3, 4, 5, 8, 7, 9, 4, 16, 5};

        System.out.println("Nhap n:");
        int n = scanner.nextInt();

        //linearSearch(a, n);

        sortAscArr(a);
        //display(a);
        binarySearch(a, n);

        scanner.close();
    }

    private static void linearSearch(int[] a, int n) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == n) {
                System.out.println("Vi tri can tim " + i);
            }
        }
    }

    private static void binarySearch(int[] a, int n) {
        int left = 0;
        int right = a.length - 1;
        boolean check = false;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (a[mid] == n) {
                System.out.println("Vi tri can tim o : " + mid);
                check = true;
                break;
            } else if (a[mid] < n) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        if (!check) {
            System.out.println("Khong co");
        }
    }

    //{1, 2, 3, 4, 5, 8, 7, 9, 4, 16, 5}
    private static void sortAscArr(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }


    }

    private static void display(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Index: " + i + " ,Value :  " + array[i]);
        }
    }
}
