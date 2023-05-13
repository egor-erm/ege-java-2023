package ru.ermolay.num16;

public class Example2 {

    public static void main(String[] args) {
        System.out.println(F(4) + G(4));
    }

    public static int F(int n) {
        if (n == 1) return 1;

        return 2 * G(n - 1) + 5 * n;
    }

    public static int G(int n) {
        if (n == 1) return 1;

        return F(n - 1) + 2 * n;
    }
}
