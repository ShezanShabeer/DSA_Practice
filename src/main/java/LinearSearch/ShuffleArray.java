package LinearSearch;

import java.util.Arrays;

public class ShuffleArray {
    public static void main(String[] args) {
        int[] nums = {2, 5, 1, 3, 4, 7};
        int n = 3;
        int[] nums1 = new int[2 * n];
        for(int i=0; i<n; i++){
            nums1[2*i] = nums[i];
            nums1[(2*i) +1] = nums[i + n];
        }
        System.out.println(Arrays.toString(nums1));

    }
}
