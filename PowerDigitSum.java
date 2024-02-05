import java.math.BigInteger;
public class PowerDigitSum {
    public static void main(String[] args) {
        BigInteger b1;
        b1 = new BigInteger("2");
        int exponent = 1000;
        BigInteger result = b1.pow(exponent);
        String power = result.toString();
        int sum=0;
        var arr = power.split("");
        for (int i = 0; i < arr.length; i++) {
            sum += Integer.parseInt(arr[i]);
        }
        System.out.println("power : " + power);
        System.out.println("sum : " + sum);
    }
}
