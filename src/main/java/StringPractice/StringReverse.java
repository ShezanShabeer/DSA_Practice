package StringPractice;

import java.util.Arrays;

public class StringReverse {
    public static void main(String[] args) {
        String str = "shezan";
        String rev = reverseString(str);
        System.out.println(rev);
    }

    static String reverseString(String str){
        char[] arr = new char[str.length()];
        for(int i = 0; i<str.length(); i++){
            arr[i] = str.charAt(i);
        }
        System.out.println(Arrays.toString(arr));
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
        String rev = "";
        for (char c : arr) {
            rev += c;
        }
        return rev;
    }
}
