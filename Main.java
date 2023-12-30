package TestC;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] a = {1, 2, 3, 4, 5, 8, 7, 9, 4, 16, 5};

//        System.out.println("Nhap n:");
//        int n = scanner.nextInt();

        //linearSearch(a, n);

        sortAscArr(a);


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

        display(arr);
    }

    private static void display(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Index: " + i + " ,Value :  " + array[i]);
        }
    }
}
