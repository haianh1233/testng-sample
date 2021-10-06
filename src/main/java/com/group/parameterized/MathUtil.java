package com.group.parameterized;

public class MathUtil {

    public static long getFactorial(int n) {
        if(n <0 || n > 20) throw new IllegalArgumentException("n must >=0 and <= 20");
        if(n == 0) return 1;
        if(n == 1) return 1;
        return n * getFactorial(n - 1);
    }
}
