package ru.ermolay.num14;

import java.math.BigInteger;

public class Example2 {

    public static void main(String[] args) {
        BigInteger n1 = BigInteger.valueOf(4).pow(2020); // получаем числа в BigInteger
        BigInteger n2 = BigInteger.valueOf(2).pow(2017);
        BigInteger n3 = BigInteger.valueOf(15);

        BigInteger res = n1.add(n2).subtract(n3); // add - прибавить, subtract - отнять
        String binary = res.toString(2);

        int count = 0;
        for (char c : binary.toCharArray()) {
            if (c == '1') {
                count++;
            }
        }

        System.out.println(count);
    }
}
