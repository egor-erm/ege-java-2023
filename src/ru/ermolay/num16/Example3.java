package ru.ermolay.num16;

public class Example3 {

    public static void main(String[] args) {
        int c = 0;
        for (int i = 1; i <= 1000; i++) {
            if (F(i) % 2 == 0) {
                c++;
            }
        }

        System.out.println(c);
    }

    public static int F(int n) {
        if (n <= 15) {
            return n*n + 3*n + 9;
        }

        if (n % 3 == 0) {
            return F(n - 1) + n - 2;
        } else {
            return F(n - 2) + n + 2;
        }
    }
}
