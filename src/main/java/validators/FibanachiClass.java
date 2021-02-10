package validators;

import java.math.BigInteger;

public class FibanachiClass {
    public static void main(String[] args) {
        System.out.println(fibanachi(5));
    }
    public static BigInteger fibanachi(int number){
        if(number<=1){
            return BigInteger.valueOf(number);
        }else{
            return fibanachi(number-1).add(fibanachi(number-2));
        }
    }
}
