package LinearSearch;

//Q= Given an array of integers, return how many of them contain an even no. of digits
//eg - arr=[12,3,4,55,1] o/p= 2
public class EvenDigits {
    public static void main(String[] args) {
        int[] arr = {12, 3, 4, 55, 1158, 88};
        System.out.println("Count is "+CountEven(arr));
    }

    static int CountEven(int[] arr){
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if (evenDigits(arr[i])){
                count++;
            }
        }
        return count;
    }

    static boolean evenDigits(int num){
        int count = 0;
        while(num>0){
            count++;
            num = num/10;
        }
        return count % 2 == 0;
    }
}
