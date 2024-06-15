package ArrayPractice;

public class PrimeNumbers {
    public static void main(String[] args) {
        int num = 69;
        System.out.println("is num "+num+" prime="+isPrime(num));
    }

    static boolean isPrime(int num){
        if (num == 2){
            return true;
        }
        if(num > 2){
            for(int i=3; i<num; i++){
                if(num%i == 0){
                    return false;
                }
            }
        } else {
            return false;
        }
        return true;
    }
}
