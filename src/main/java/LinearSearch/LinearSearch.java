package LinearSearch;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = {23, 45, 2, 6, 9, 33, 21};
        int element = 55;
        int ans = linearSearch(arr, element);
        System.out.println(ans);
    }

    static int linearSearch(int[] arr, int element){
        if(arr.length == 0){
            return -1;
        }

        for (int i=0; i<arr.length; i++){
            int num = arr[i];
            if(element == num){
                return i;
            }
        }
        return -1;
    }
}
