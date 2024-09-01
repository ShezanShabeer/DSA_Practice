package ArrayPractice;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {12, 54, 99, 100, 88};
        //reverseArr(arr);
        reverseStartEnd(arr);
        String name = "Shezan12";
        if (name.matches("[A-Za-z0-9]*")){
            System.out.println("okay");
        }
    }

    static void reverseStartEnd(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
    }

    static void reverseArr(int[] arr){
        //int[] arr2 = null;
        int temp = 0;
        for (int i = 0; i<arr.length; i++){
            for (int j = 0; j<=i; j++){
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
