package ru.ermolay.num21;

public class Example3 {

    public static void main(String[] args) {
        for (int s = 1; s <= 99; s++) {
            if (game(s, 0, 1)) {
                System.out.println(s);
            }
        }

        for (int s = 1; s <= 99; s++) {
            if (gamen(s, 0, 1)) {
                System.out.println(s);
            }
        }
    }

    public static boolean game(int s, int t, int h) {
        if ((h == 3 || h == 5) && s >= 100) return true;
        if (h == 5 && s < 100) return false;
        if (h < 5 && s >= 100) return false;

        if (h % 2 == 0) {
            h++;
            switch (t) {
                case 0:
                    return game(s + 1, 1, h) || game(s + 3, 2, h) || game(s * 3, 3, h);
                case 1:
                    return game(s + 3, 2, h) || game(s * 3, 3, h);
                case 2:
                    return game(s + 1, 1, h) || game(s * 3, 3, h);
                case 3:
                    return game(s + 1, 1, h) || game(s + 3, 2, h);
            }
        } else {
            h++;

            switch (t) {
                case 0:
                    return game(s + 1, 1, h) && game(s + 3, 2, h) && game(s * 3, 3, h);
                case 1:
                    return game(s + 3, 2, h) && game(s * 3, 3, h);
                case 2:
                    return game(s + 1, 1, h) && game(s * 3, 3, h);
                case 3:
                    return game(s + 1, 1, h) && game(s + 3, 2, h);
            }
        }

        return false;
    }

    public static boolean gamen(int s, int t, int h) {
        if (h == 3 && s >= 100) return true;
        if (h == 3 && s < 100) return false;
        if (h < 3 && s >= 100) return false;

        if (h % 2 == 0) {
            h++;
            switch (t) {
                case 0:
                    return gamen(s + 1, 1, h) || gamen(s + 3, 2, h) || gamen(s * 3, 3, h);
                case 1:
                    return gamen(s + 3, 2, h) || gamen(s * 3, 3, h);
                case 2:
                    return gamen(s + 1, 1, h) || gamen(s * 3, 3, h);
                case 3:
                    return gamen(s + 1, 1, h) || gamen(s + 3, 2, h);
            }
        } else {
            h++;

            switch (t) {
                case 0:
                    return gamen(s + 1, 1, h) && gamen(s + 3, 2, h) && gamen(s * 3, 3, h);
                case 1:
                    return gamen(s + 3, 2, h) && gamen(s * 3, 3, h);
                case 2:
                    return gamen(s + 1, 1, h) && gamen(s * 3, 3, h);
                case 3:
                    return gamen(s + 1, 1, h) && gamen(s + 3, 2, h);
            }
        }

        return false;
    }
}