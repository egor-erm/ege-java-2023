package ru.ermolay.num14;

import java.math.BigInteger;

public class Example9 {

    public static void main(String[] args) {
        BigInteger a = BigInteger.valueOf(8).pow(2020);
        BigInteger b = BigInteger.valueOf(4).pow(2017);

        BigInteger sum = a.add(b).add(BigInteger.valueOf(26)).subtract(BigInteger.ONE);

        int otv = 0;
        for (char c : sum.toString(2).toCharArray()) {
            if (c == '1') {
                otv++;
            }
        }
        System.out.println(otv);
    }
}
