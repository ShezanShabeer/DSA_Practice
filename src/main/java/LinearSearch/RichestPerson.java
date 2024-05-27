package LinearSearch;

//Q = https://leetcode.com/problems/richest-customer-wealth/description/
public class RichestPerson {
    public static void main(String[] args) {
        int[][] arr = {{2,3,4}, {2,6,9}, {1,2,31}};
        System.out.println(richestPerson(arr));
    }

    static int richestPerson(int[][] arr){
        if (arr.length == 0){
            return -1;
        }
        int maxVal = Integer.MIN_VALUE;

        for(int person=0; person<arr.length; person++){
            int rowsum = 0;
            for(int account=0; account<arr[person].length; account++){
                rowsum += arr[person][account];
            }
            if (rowsum > maxVal){
                maxVal = rowsum;
            }
        }
        return maxVal;
    }
}
