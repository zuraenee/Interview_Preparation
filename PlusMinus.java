import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
    // Write your code here
    int totalSize = arr.size();
        double PositiveNumber = 0;
        double NegativeNumber = 0;
        double Zero = 0;
        // Write your code here
        for (int i=0; i<totalSize; i++ ){
            if (arr.get(i)>0){
                PositiveNumber += 1;
            }
            else if (arr.get(i)<0){
                NegativeNumber += 1;
            }
            else if (arr.get(i) == 0){
                Zero += 1;
            }
        }
            System.out.println(String.format("%.6f",PositiveNumber/totalSize));
            System.out.println(String.format("%.6f",NegativeNumber/totalSize));
            System.out.println(String.format("%.6f",Zero/totalSize));
        
    }

}

