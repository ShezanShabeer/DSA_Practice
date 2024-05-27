package BinarySearch;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {23, 21, 19, 14, 12, 10, 9, 7, 6};
        int target = 14;
        System.out.println(orderAgnosticBS(arr, target));
    }

    static int orderAgnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc;
        isAsc = arr[start] <= arr[end];

        while (start <= end){
            int mid = start + (end - start) / 2;
            if (target == arr[mid]){
                return mid;
            }
            if (isAsc){
                if (target > arr[mid]){
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if ( target > arr[mid]){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
