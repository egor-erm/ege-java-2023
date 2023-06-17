package ru.ermolay.num16;

import java.math.BigInteger;
import java.util.Objects;

public class Example6 {

    public static void main(String[] args) {
        BigInteger a = F(BigInteger.valueOf(1900)).divide(BigInteger.TWO.pow(1890));
        System.out.println(a);
    }

    public static BigInteger F(BigInteger n) {
        if (Objects.equals(n, BigInteger.ONE)) return BigInteger.TWO;

        return F(n.subtract(BigInteger.ONE)).multiply(BigInteger.TWO);
    }
}
