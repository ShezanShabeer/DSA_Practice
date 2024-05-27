package LinearSearch;

public class SearchChar {
    public static void main(String[] args) {
        String name = "Shezan";
        char s = 'f';
        System.out.println(searchChar(name, s));
    }

    static boolean searchChar(String name, char s){
        if (name.isEmpty()){
            return false;
        }
        for(int i=0; i<name.length(); i++){
            if (name.charAt(i) == s){
                return true;
            }
        }
        return false;
    }
}
