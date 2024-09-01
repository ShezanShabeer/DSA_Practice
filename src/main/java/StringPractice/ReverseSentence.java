package StringPractice;

import java.util.Arrays;

public class ReverseSentence {
    public static void main(String[] args) {
        String str = "My name is Shezan Shabeer";
        //o/p = "Shabeer Shezan is name My"
        reverseSentence(str);
    }

    static void reverseSentence(String str){
        System.out.println(str);
        String[] ans = str.split(" ");
        int start = 0;
        int end = ans.length - 1;
        String name = "";
        for(int i=ans.length-1; i>=0; i--){
            name += ans[i] + " ";
        }
        System.out.println(name);
    }
}
