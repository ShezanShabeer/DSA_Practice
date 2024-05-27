package ArrayPractice;

import java.util.Arrays;

public class SwapElements {
    public static void main(String[] args) {
        int[] arr = {12, 45, 66, 98, 100, 101};
        int e1 = 101;
        int e2 = 12;
        int[] arr2 = swap(arr, e1, e2);
        System.out.println(Arrays.toString(arr2));
    }

    static int[] swap(int[] arr, int e1, int e2){
        int temp = 0;
        for (int i = 0; i<arr.length; i++){
            if (arr[i] == e1){
                for (int j=0; j<arr.length; j++){
                    if (arr[j] == e2){
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }


        }
        return arr;
    }
}
