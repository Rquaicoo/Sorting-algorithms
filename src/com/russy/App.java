package com.russy;

import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Select the sorting method you want to use");
        System.out.println("1.  Insertion sort 2. Shell sort 3. Selection sort 4. Quicksort");

        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        System.out.println("Enter the number of elements in the array (max = 20)");
        int n = scan.nextInt();

        System.out.println("Enter the figures in the array");
        int[] array = new int[n];

        for (int i=0; i<n; i++) {
            array[i] = scan.nextInt();
        }

        if (number==1) {
            Sorting.insertionSort(array);
            System.out.println(Arrays.toString(array));
        }

        if (number==2) {
            Sorting.shellSort(array);
            System.out.println(Arrays.toString(array));
        }

        if (number==3) {
            Sorting.selectionSort(array);
            System.out.println(Arrays.toString(array));
        }

        if(number==4) {
            Sorting.quicksort(array, 0, array.length-1);
            System.out.println(Arrays.toString(array));
        }

    }
}
