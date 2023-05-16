package ru.ermolay.num23;

public class Example1 {

    public static void main(String[] args) {
        System.out.println(f(1, 12) * f(12, 40));
    }

    public static int f(int x, int y) {
        if (x > y || x == 14) return 0;
        if (x == y) return 1;

        return f(x + 1, y) + f(x * 2, y) + f(x * 3, y);
    }
}
