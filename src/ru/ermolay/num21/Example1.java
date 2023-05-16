package ru.ermolay.num21;

public class Example1 {

    public static void main(String[] args) { // не сделано
        for (int s = 1; s <= 67; s++) {
            if (game(16, s, 0)) {
                System.out.println(s);
            }
        }
    }

    public static boolean game(int x, int y, int h) {
        if (h == 3 && x + y >= 84) return true; // выиграл Петя
        if (h == 3 && x + y < 84) return false; // после хода Петя не смог выиграть
        if (h < 3 && x + y >= 84) return false; // первым же ходом выиграл Вася

        h++;
        if (h % 2 == 0) {
            return game(x + 1, y, h) && game(x, y + 1, h) && game(x * 2, y, h) && game(x, y * 3, h);
        } else {
            return game(x + 1, y, h) || game(x, y + 1, h) || game(x * 2, y, h) || game(x, y * 3, h);
        }
    }
}
