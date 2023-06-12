package ru.ermolay.num16;

public class Example5 {

    public static void main(String[] args) {
       System.out.println(F(5));
    }

    public static int F(int n) {
        if (n == 1) return 1;
        if (n == 2) return 3;

        return F(n-1) * n + F(n-2) * (n-1);
    }
}
