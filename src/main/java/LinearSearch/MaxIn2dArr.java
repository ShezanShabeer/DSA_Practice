package LinearSearch;

public class MaxIn2dArr {
    public static void main(String[] args) {
        int[][] arr = {{2, 4, 88},
                {34, 7, -9},
                {22, 5, 699}};
        //int target = 88;
        int ans = Maxsearch2d(arr);
        System.out.println("Max value in 2d arr = "+ans);
    }
    static int Maxsearch2d(int[][] arr){
        if (arr.length == 0){
            return -1;
        }
        int maxVal = Integer.MIN_VALUE;

        for (int row = 0; row < arr.length; row++){
            for (int col = 0; col < arr[row].length; col++){
                if (arr[row][col] > maxVal){
                    maxVal = arr[row][col];
                }
            }
        }
        return maxVal;
    }
}
