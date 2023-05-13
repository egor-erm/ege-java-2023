package ru.ermolay.num15;

public class Example4 {

    public static void main(String[] args) {
        for (int A = 1000; A > 0; A--) {
            int tests = 0;
            for (int x = 0; x < 100; x++) {
                for (int y = 0; y < 100; y++) {
                    if ((parseBool(x <= 9) <= parseBool(x * x <= A)) && (parseBool(y * y <= A) <= parseBool(y <= 9))) {
                        tests++;
                    }
                }
            }

            if (tests == 100 * 100) {
                System.out.println(A);
                return;
            }
        }
    }

    public static int parseBool(boolean ok) {
        if (ok) return 1;

        return 0;
    }
}
