package ru.ermolay.num21;

public class Example2 {

    public static void main(String[] args) {
        for (int s = 1; s <= 241; s++) {
            if (game2(17, s, 1)) {
                System.out.println("1 " + s);
            }
        }

        for (int s = 1; s <= 241; s++) {
            if (game1(17, s, 1)) {
                System.out.println("2 " + s);
            }
        }
    }

    public static boolean game1(int x, int y, int h) {
        if (h == 3 && x + y >= 259) return true;
        if (h == 3 && x + y < 259) return false;
        if (h < 3 && x + y >= 259) return false;

        if (h % 2 == 0) {
            h++;
            return game1(x + 1, y, h) || game1(x, y + 1, h) || game1(x * 2, y, h) || game1(x, y * 2, h);
        } else {
            h++;
            return game1(x + 1, y, h) && game1(x, y + 1, h) && game1(x * 2, y, h) && game1(x, y * 2, h);
        }
    }

    public static boolean game2(int x, int y, int h) {
        if ((h == 3 || h == 5) && x + y >= 259) return true;
        if (h == 5 && x + y < 259) return false;
        if (h < 5 && x + y >= 259) return false;

        if (h % 2 == 0) {
            h++;
            return game2(x + 1, y, h) || game2(x, y + 1, h) || game2(x * 2, y, h) || game2(x, y * 2, h);
        } else {
            h++;
            return game2(x + 1, y, h) && game2(x, y + 1, h) && game2(x * 2, y, h) && game2(x, y * 2, h);
        }
    }
}
