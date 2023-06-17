package ru.ermolay.num20;

public class Example3 {

    public static void main(String[] args) {
        for (int s = 1; s <= 241; s++) {
            if (game(17, s, 1)) {
                System.out.println(s);
            }
        }
    }

    public static boolean game(int x, int y, int h) {
        if (h == 4 && x + y >= 259) return true;
        if (h == 4 && x + y < 259) return false;
        if (h == 3 && x + y >= 259) return false;

        if (h % 2 != 0) {
            h++;
            return game(x + 1, y, h) || game(x, y + 1, h) || game(x * 2, y, h) || game(x, y * 2, h);
        } else {
            h++;
            return game(x + 1, y, h) && game(x, y + 1, h) && game(x * 2, y, h) && game(x, y * 2, h);
        }
    }
}
