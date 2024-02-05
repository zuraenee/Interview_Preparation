import java.util.ArrayList;

public class ConsecutivePrimeSum {
    public static boolean isPrime(int num){
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= num/2; i++) {
            if (num%i ==0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int finalLength = 0;
        int finalSum = 0;
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 1; i <= 1000; i++) {
            if(isPrime(i)){
                arr.add(i);
            }
        }
        System.out.println(arr);


        for (int i = 0; i < arr.size(); i++) {
            int sum = 0;
            int length = 0;
            for (int j = i; j < arr.size(); j++) {
                sum += arr.get(j);
                length++;
                if (sum > 1000) {
                    break;
                }
                if (isPrime(sum) && length > finalLength) {
                    finalLength = length;
                    finalSum = sum;
                }
            }
        }
        System.out.println("length : " + finalLength);
        System.out.println("sum : " + finalSum);
    }
}
