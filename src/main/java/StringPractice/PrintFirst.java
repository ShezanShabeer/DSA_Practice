package StringPractice;

public class PrintFirst {
    public static void main(String[] args) {
        String str = "Boy is good";
        printFirstLetter(str);

        String name = "SheZAnn";
        int lowerCount = 0;
        int upperCount = 0;
        String[] ans = name.split("");
        for(int i=0; i<ans.length; i++){
            if(ans[i].matches("[A-Z]")){
                upperCount +=1;
            } else if(ans[i].matches("[a-z]")){
                lowerCount += 1;
            }
        }
        System.out.println("Number of uppercase = "+upperCount);
        System.out.println("Number of lowecase = "+lowerCount);
    }

    static void printFirstLetter(String str){
        String[] ans = str.split(" ");
        String res = "";
        for (String an : ans) {
            res += an.charAt(0);
        }
        System.out.println(res);
    }
}
