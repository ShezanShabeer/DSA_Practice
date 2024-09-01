package BubbleSorting;

import com.sun.source.tree.ArrayAccessTree;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr){
        for(int i=0; i<arr.length; i++){
            int last = arr.length - i - 1;
            int maxIndexValue = maxIndex(arr, last);
            swap(arr, maxIndexValue, last);
        }
    }

    static int maxIndex(int[] arr, int last){
        int maxIndex = 0;
        for(int i=0; i<=last; i++){
            if(arr[i] > arr[maxIndex]){
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
