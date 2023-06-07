package ru.ermolay.num16;

public class Example4 {

    public static void main(String[] args) {
        System.out.println(F(40));
    }

    public static int F(int n) {
        if (n == 1) return 1;

        return F(n - 1) + n;
    }
}
