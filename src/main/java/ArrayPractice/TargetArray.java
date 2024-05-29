package ArrayPractice;
//Q- https://leetcode.com/problems/create-target-array-in-the-given-order/description/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TargetArray {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        int[] target2 = new int[nums.length];
        ArrayList<Integer> target3 = new ArrayList<>();
        for(int i : nums){
            target3.add(i);
        }
        System.out.println(target3);
        ArrayList<Integer> target = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            target.add(index[i], nums[i]);
        }
        System.out.println(target);
        for(int i=0; i<target.size(); i++){
            target2[i] = target.get(i);
        }
        System.out.println(Arrays.toString(target2));
    }
}
