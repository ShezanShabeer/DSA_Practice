package ArrayPractice;
//Q - https://leetcode.com/problems/add-to-array-form-of-integer/
import java.util.*;

public class ArrayForm {
    public static void main(String[] args) {
        int[] num = {1,2,0,0};
        int k = 34;
        List<Integer> res = new LinkedList<>();
        for(int i=num.length-1; i>=0; i--){
            int sum = num[i] + k;
            res.add(0,sum%10);
            k = sum/10;
        }
        while (k>0){
            res.add(0,k%10);
            k /= 10;
        }
        System.out.println(res);

    }
}
