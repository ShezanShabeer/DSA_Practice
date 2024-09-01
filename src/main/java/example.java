import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedList;

public class example {
    public static void main(String[] args) {
        String str = "aabbcdddeed";
        LinkedHashMap<Character,Integer> mp = new LinkedHashMap<>();
        for (Character c : str.toCharArray()){
            if(mp.containsKey(c)){
                mp.put(c,mp.get(c)+1);
            }
            else {
                mp.put(c,1);
            }
        }
        System.out.println(mp);
        String str2 = "";
        for(Object i : mp.keySet()){
            str2 += i;
            str2 += mp.get(i);
        }
        System.out.println(str2);
    }
}
