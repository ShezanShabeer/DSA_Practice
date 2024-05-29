package ArrayPractice;

import java.util.Arrays;

//Q= https://leetcode.com/problems/find-the-highest-altitude/
public class LargestAltitude {
    public static void main(String[] args) {
        int[] gain = {-5, 1, 5, 0, -7};
        int[] ans = new int[gain.length + 1];
        ans[0] = 0;
        for (int i=0; i<gain.length; i++){
            ans[i+1] = ans[i] + gain[i];
        }
        int highest = 0;
        for (int j=0; j<ans.length; j++){
            if (ans[j]>highest){
                highest = ans[j];
            }
        }
        System.out.println(Arrays.toString(ans));
        System.out.println("Highest Altitude= "+highest);
    }
}
