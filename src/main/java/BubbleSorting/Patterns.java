package BubbleSorting;

public class Patterns {
    public static void main(String[] args) {
        pattern1(5);
    }

    static void pattern1(int n){
        int j = n;
        for(int row=1; row<=n; row++) {
            for (int col = 1; col <= j; col++) {
                System.out.print("* ");
            }
            j -= 1;
            System.out.println();
        }
    }
}
