package com.russy;

public class Searching {
    public static int linearSearch(int[] arr, int key){    
        for(int i=0;i<arr.length;i++){    
            if(arr[i] == key){    
                return i;    
            }    
        }    
        return -1;    
    }

    public static void binarySearch(int arr[], int first, int last, int key){  
        int mid = (first + last)/2;  
        while( first <= last ){  
           if ( arr[mid] < key ){  
             first = mid + 1;     
           }else if ( arr[mid] == key ){  
             System.out.println("Element is found at index: " + mid);  
             break;  
           }else{  
              last = mid - 1;  
           }  
           mid = (first + last)/2;  
        }  
        if ( first > last ){  
           System.out.println("Element is not found!");  
        }  
      }

}
