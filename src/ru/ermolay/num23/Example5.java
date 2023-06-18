package ru.ermolay.num23;

public class Example5 {

    public static void main(String[] args) {
        System.out.println(f(1, 410));
    }

    public static long f(long x, long y) {
        if (x > y) return 0;
        if (x == y) return 1;

        return f(x + 1, y) + f(get(x), y) + f(x * 5, y);
    }

    public static long get(long n) {
        if (Long.parseLong(n + "" + 1) % 3 == 0) {
            return Long.parseLong(n + "" + 1);
        }

        return 100000000;
    }
}
