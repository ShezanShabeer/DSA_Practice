package ArrayPractice;

import java.util.HashSet;

//Q - https://leetcode.com/problems/check-if-the-sentence-is-pangram/description/
public class PangramSentence {
    public static void main(String[] args) {
        String word="leetcode";
        char[] ch = word.toCharArray();
        HashSet<Character> result = new HashSet<Character>();

        for(int i=0;i<word.length();i++)
        {
            result.add(ch[i]);
        }
        System.out.println(result);
        if(result.size() == 26){
            System.out.println(true);
        }
        else{
            System.out.println(false);}
    }
}
