package ArrayPractice;

import java.util.List;

//Q = https://leetcode.com/problems/count-items-matching-a-rule/
public class RuleMatching {
    public static void main(String[] args) {
        List<String> list1 = List.of("phone","blue","pixel");
        List<String> list2 = List.of("computer","silver","lenovo");
        List<String> list3 = List.of("phone","gold","iphone");
        List<List<String>> items = List.of(list1, list2, list3);
        System.out.println(items);

        String ruleKey = "color";
        String ruleValue = "silver";
        int count = 0;
        for(List<String> i : items){
            if(ruleKey.equals("type") && i.get(0).equals(ruleValue)){
                count += 1;
            } else if (ruleKey.equals("color") && i.get(1).equals(ruleValue)) {
                count += 1;
            } else if (ruleKey.equals("name") && i.get(2).equals(ruleValue)) {
                count += 1;
            }
        }
        System.out.println(count);
    }
}
