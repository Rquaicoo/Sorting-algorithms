package com.russy;
public class Sorting{
    public static void insertionSort(int[] array) {
        int temp;
        for(int j = 0; j <= array.length; j++) {
            for(int index =1 ; index < array.length; index++) {
                if (array[index] < array[index - 1]) {
                    temp = array[index];
                    array[index] = array[index - 1];
                    array[index - 1] = temp;
                }
            }
        }
    }

    public static void quicksort(int[] array, int left, int right){

        int index = partition(array, left, right);
        if(left < index -1)
            quicksort(array, left, index-1);
        if(index<right)
            quicksort(array, index, right);
    }

    public static void shellSort(int arrayToSort[]) {
        int n = arrayToSort.length;
    
        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int key = arrayToSort[i];
                int j = i;
                while (j >= gap && arrayToSort[j - gap] > key) {
                    arrayToSort[j] = arrayToSort[j - gap];
                    j -= gap;
                }
                arrayToSort[j] = key;
            }
        }
    }

    public static int partition(int[] array, int left, int right) {
        int pivot = array[(left+right) / 2];
        while (left <= right) {
            while(array[left] < pivot )
                left++;
            while(array[right] > pivot)
                right--;
            if(left <= right) {
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;

                left++;
                right--;
            }
        }
        return left;
    }

    public static void selectionSort(int[] arr){  
        for (int i = 0; i < arr.length - 1; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < arr.length; j++){  
                if (arr[j] < arr[index]){  
                    index = j;//searching for lowest index  
                }  
            }  
            int smallerNumber = arr[index];   
            arr[index] = arr[i];  
            arr[i] = smallerNumber;  
        }  
    }
}
