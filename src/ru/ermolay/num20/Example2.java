package ru.ermolay.num20;

public class Example2 {

    public static void main(String[] args) {
        for (int s = 1; s <= 58; s++) {
            if (game(s, 10, 1)) {
                System.out.println(s);
            }
        }
    }

    public static boolean game(int x, int y, int h) {
        if (h == 4 && x + y >= 69) return true;
        if (h == 4 && x + y < 69) return false;
        if (h < 4 && x + y >= 69) return false;

        if (h % 2 != 0) {
            h++;
            return game(x + 1, y, h) || game(x, y + 1, h) || game(x, y * 2, h) || game(x * 3, y, h);
        } else {
            h++;
            return game(x + 1, y, h) && game(x, y + 1, h) && game(x, y * 2, h) && game(x * 3, y, h);
        }
    }
}
