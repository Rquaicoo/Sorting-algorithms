import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Select the sorting method you want to use");
        System.out.println("1.  Insertion sort 2. Merge sort 3. Shell sort 4. Quicksort");

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
            insertionSort(array);
            System.out.println(Arrays.toString(array));
        }

        if(number==4) {
            quicksort(array, 0, array.length-1);
            System.out.println(Arrays.toString(array));
        }


    }

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


}

