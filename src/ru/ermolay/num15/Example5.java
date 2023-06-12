package ru.ermolay.num15;

public class Example5 {

    public static void main(String[] args) {
        for (int A = 10000; A >= 0; A--) {

            boolean fail = false;
            for (int x = 0; x <= 250; x++) {
                if (fail) break;

                for (int y = 0; y <= 250; y++) {
                    if (!((2 * x + 3 * y < 30) || (x + y >= A))) {
                        fail = true;
                        break;
                    }
                }
            }

            if (!fail) {
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
