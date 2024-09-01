package StringPractice;

public class Palindrome {
    public static void main(String[] args) {
        String str = "";
        System.out.println(isPalindrome(str));
    }

    static boolean isPalindrome(String name){
        name = name.toLowerCase();
        int start = 0;
        int end = name.length()-1;
        while(start<end){
            if(name.charAt(start) !=  name.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}

