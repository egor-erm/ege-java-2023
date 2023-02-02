package ru.ermolay.num16;

public class Example1 {

    public static void main(String[] args) {
        System.out.println(F(40));
    }

    public static int F(int n) { // делаем функцию
        if (n == 1) {
            return n;
        } else if (n > 1) {
            return F(n - 1) + n; // рекурсия
        }

        return 0;
    }
}
