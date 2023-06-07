package ru.ermolay.num14;

import java.math.BigInteger;

public class Example7 {

    public static void main(String[] args) {
        BigInteger a = BigInteger.valueOf(4).pow(2020);
        BigInteger b = BigInteger.valueOf(2).pow(2017);
        BigInteger c = BigInteger.valueOf(15);

        BigInteger s = a.add(b).subtract(c);
        String bin = s.toString(2);

        int otv = 0;
        for (char d : bin.toCharArray()) {
            if (d == '1') {
                otv++;
            }
        }

        System.out.println(otv);
    }
}
