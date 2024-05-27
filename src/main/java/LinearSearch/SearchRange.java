package LinearSearch;
//Q - if given arr of size 10, search for element in range of [1,4]
public class SearchRange {
    public static void main(String[] args) {
        int[] arr1 = {23, 5, 8, 9, 22, 34, 89};
        int element = 34;
        System.out.println(searchRange(arr1, element));
    }

    static int searchRange(int[] arr1, int num ){
        if (arr1.length == 0){
            return -1;
        }

        for (int i = 1; i<=4; i++){
            int element = arr1[i];
            if (num == element){
                return i;
            }
        }
        return -1;
    }
}
