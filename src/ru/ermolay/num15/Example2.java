package ru.ermolay.num15;

import java.util.ArrayList;

public class Example2 {

    public static void main(String[] args) { // решение задачи на отрезки универсальное, главно выводить мимнимальный или максимальный отрезок
        ArrayList<Integer> P = new ArrayList<>();
        ArrayList<Integer> Q = new ArrayList<>();

        for (int i = 4; i <= 15; i++) { // заполняем отрезок
            P.add(i);
        }

        for (int i = 12; i <= 20; i++) { // заполняем отрезок
            Q.add(i);
        }

        int min = 10000;
        for (int amin = 0; amin <= 100; amin++) { // перебор всех отрезков
            for (int amax = 100; amax >= 0; amax--) {
                if (amax <= amin) {
                    break;
                }

                ArrayList<Integer> A = new ArrayList<>();
                for (int a = amin; a <= amax; a++) { // заполняем лист точками отрезка
                    A.add(a);
                }

                int tests = 0;
                for (int x = 0; x < 100; x++) { // проводим тесты
                    if (parseBool((parseBool(P.contains(x)) == 1 && parseBool(Q.contains(x)) == 1)) <= parseBool(A.contains(x))) {
                        tests++;
                    }
                }

                if (tests >= 100) { // если тесты пройдены, то длину проверяем на мин/макс, смотря по условию задачи
                    min = Math.min(min, amax - amin);
                }
            }
        }

        System.out.println(min);
    }

    public static int parseBool(boolean ok) {
        if (ok) return 1;

        return 0;
    }
}
