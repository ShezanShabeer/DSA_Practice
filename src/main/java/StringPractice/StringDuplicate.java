package StringPractice;

import java.util.Arrays;
import java.util.LinkedHashMap;

public class StringDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,2,1,4,5,3,4,6,7,4};
        LinkedHashMap<Integer,Boolean> mp = new LinkedHashMap<>();
        for(int i=0; i<arr.length; i++){
            if(mp.get(arr[i]) == null){
                System.out.print(arr[i]+" ");
                mp.put(arr[i],true);
            }
        }
    }
}
