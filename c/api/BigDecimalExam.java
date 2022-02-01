package c.api;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class BigDecimalExam {
    public static void main(String[] args) {

        // unscale
        BigDecimal i1 = BigDecimal.ONE;
        BigDecimal i2 = new BigDecimal(2);
        BigDecimal i3 = new BigDecimal("3");

        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);

        // scale
        BigDecimal d1 = new BigDecimal(3.14); // default : 128, 34
        BigDecimal d2 = new BigDecimal(3.14);
        BigDecimal d3 = d1.add(d2);
        System.out.println(d3);
        System.out.println(d2);

        // Operation

        // make Value
        BigDecimal x = new BigDecimal(10); // 10
        BigDecimal y = new BigDecimal(3); // 3

        // add
        System.out.println(x.add(y)); // 13

        // subtract
        System.out.println(x.subtract(y)); // 7

        // divide
        // System.out.println(x.divide(y)); error
        System.out.println(x.divide(y, MathContext.DECIMAL128)); // 3.333333333333333333333333333333333
        System.out.println(x.divide(y, 3, RoundingMode.UP)); // 3.334
        System.out.println(x.divideToIntegralValue(y)); // 3

        // multiply
        System.out.println(x.multiply(y)); // 30

        // remainder
        System.out.println(x.remainder(y)); // 1

        // divide And remainder
        BigDecimal[] array = new BigDecimal[2];
        array = x.divideAndRemainder(y); // [3, 1]

        System.out.println(array[0]); // divided value : 3
        System.out.println(array[1]); // remainded value : 1
    }
}
