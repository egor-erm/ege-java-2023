package ru.ermolay.num19;

public class Example5 {

    public static void main(String[] args) {
        for (int s = 1; s < 10; s++) {
            if (game(3, s, 1)) {
                System.out.println(s);
                return;
            }
        }
    }

    public static boolean game(int x, int y, int h) {
        if (h == 3 && x + y >= 13) return true;
        if (h == 3 && x + y < 13) return false;
        if (h < 3 && x + y >= 13) return false;

        if (h % 2 == 0) {
            h++;
            return game(x + 1, y, h) || game(x + 2, y, h) || game(x, y + 1, h) || game(x, y + 2, h);
        } else {
            h++;
            return game(x + 1, y, h) && game(x + 2, y, h) && game(x, y + 1, h) && game(x, y + 2, h);
        }
    }
}
