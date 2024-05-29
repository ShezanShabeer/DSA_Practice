package ArrayPractice;

//Q- https://leetcode.com/problems/number-of-good-pairs/

import java.util.*;

public class NoOfGoodPairs {
    public static void main(String[] args) {
        LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>();
        int[] nums = {1,2,3,1,1,3};
        for (Integer i: nums){
            if(map.containsKey(i)){
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i,1);
            }
        }
        int count = 0;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue()>1){
                count += entry.getValue() * (entry.getValue() - 1) / 2;
            }
        }
        System.out.println(count);
    }
}
