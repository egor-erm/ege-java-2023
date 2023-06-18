package ru.ermolay.num16;

import java.math.BigInteger;

public class Example7 {

    public static void main(String[] args) {
        System.out.println(fn(BigInteger.valueOf(3303)).divide(fn(BigInteger.valueOf(3300))));
    }

    public static BigInteger fn(BigInteger n) {
        if (n.equals(BigInteger.ONE)) return BigInteger.ONE;

        return n.multiply(fn(n.subtract(BigInteger.ONE))).add(BigInteger.ONE);
    }
}
