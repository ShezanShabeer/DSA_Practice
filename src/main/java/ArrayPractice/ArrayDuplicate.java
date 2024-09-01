package ArrayPractice;

import java.util.Locale;

public class ArrayDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,1,2,5,3,7,8,3,8,9};
        int[] ans = new int[arr.length];
        //int m=0;
        boolean ele = false;
        for(int i=0; i<arr.length; i++){
            ele = false;
            for(int j=0; j<ans.length; j++){
                if(ans[j] == arr[i]){
                    ele = true;
                    break;
                }
            }
            if(!ele){
                ans[i] = arr[i];
                //m++;
            }
        }
        for(int i=0; i<ans.length; i++){
            if(ans[i]>0){
                System.out.print(ans[i]+" ");
            }
        }

        String str = "SHEzan";
        str = str.toLowerCase();
        System.out.println(str);
    }
}
