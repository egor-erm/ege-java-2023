package ru.ermolay.num15;

public class Example6 {

    public static void main(String[] args) {
        int otv = 0;
        for (int a = 1; a < 10000; a++) {
            boolean ok = true;

            for (int x = 1; x < 1000; x++) {
                if (!(del(a, 25) == 1 && (parse(del(x, 24) == 1 && del(x, 75) == 1) <= del(x, a)))) {
                    ok = false;
                    break;
                }
            }

            if (ok) otv++;
        }

        System.out.println(otv);
    }

    public static int del(int n, int m) {
        if (n % m == 0) return 1;

        return 0;
    }

    public static int parse(boolean ok) {
        if (ok) return 1;

        return 0;
    }
}
