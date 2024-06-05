package ArrayPractice;

import java.util.Arrays;

//Q- https://leetcode.com/problems/reverse-prefix-of-word/
public class ReversePrefix {
    public static void main(String[] args) {
        String word = "abcdefd";
        char ch = 'd';
        String reverse = reversePrefix(word, ch);
        System.out.println(reverse);
    }

    static String reversePrefix(String word, char ch){
        int index = word.indexOf(ch);
        char[] arr = word.toCharArray();
        int start = 0;
        while (start<=index){
            char temp = arr[start];
            arr[start] = arr[index];
            arr[index] = temp;
            start++;
            index--;
        }
        String reverse = "";
        for(int i=0; i<arr.length; i++){
            reverse = reverse + arr[i];
        }
        return reverse;

//        int index = word.indexOf(ch);
//        if (index!=-1){
//            return new StringBuilder(word.substring(0,index+1)).reverse() + word.substring(index+1);
//        }
//        return word;
    }
}
