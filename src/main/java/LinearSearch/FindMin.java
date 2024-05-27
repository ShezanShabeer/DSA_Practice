package LinearSearch;

public class FindMin {
    public static void main(String[] args) {
        int[] arr = {21, 44, 5, 66, 3, 23, 90};
        System.out.println(minSearch(arr));
    }

    static int minSearch(int[] arr){
        if (arr.length == 0){
            return -1;
        }
        int min = arr[0];
        for (int j : arr) {
            if (min > j) {
                min = j;
            }
        }
        return min;
    }
}
