package ru.ermolay.num23;

public class Example4 {

    public static void main(String[] args) {
        System.out.println(f(108, 42) * f(42, 12));
    }

    public static int f(int x, int y) {
        if (x < y) return 0;
        if (x == y) return 1;

        return f(x-3, y) + f((int)Math.floor(((double)x) / 2), y);
    }
}
