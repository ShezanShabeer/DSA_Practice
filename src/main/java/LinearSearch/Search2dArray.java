package LinearSearch;

import java.util.Arrays;

public class Search2dArray {
    public static void main(String[] args) {
        int[][] arr = {{2, 4, 88},
                {34, 7, -9},
                {22, 5, 6}};
        int target = 88;
        int[] ans = search2d(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] search2d(int[][] arr, int target){
        if (arr.length == 0){
            return new int[]{-1, -1};
        }

        for (int row = 0; row < arr.length; row++){
            for (int col = 0; col < arr[row].length; col++){
                if (arr[row][col] == target){
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
