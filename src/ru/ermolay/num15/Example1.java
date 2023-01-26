package ru.ermolay.num15;

public class Example1 {

    public static void main(String[] args) {
        for (int a = 500; a > 0; a--) {
            int k = 0;
            for (int x = 0; x < 500; x++) {
                boolean br = false;
                for (int y = 0; y < 500; y++) {
                    if ((parseBool(x <= 9) <= parseBool(x * x <= a)) && (parseBool(y * y <= a) <= parseBool(y <= 9))) {
                        k++;
                    } else {
                        br = true;
                        break;
                    }
                }

                if (br) break;
            }

            if (k == 500 * 500) {
                System.out.println(a);
                return;
            }
        }
    }

    public static int parseBool(boolean b) {
        if (b) return 1;

        return 0;
    }
}
