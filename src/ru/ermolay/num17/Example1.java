package ru.ermolay.num17;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Example1 {

    public static void main(String[] args) throws FileNotFoundException { // обязательно throws
        Scanner in = new Scanner(new File("src/ru/ermolay/num17/17-1.txt")); // читаем

        ArrayList<Integer> ints = new ArrayList<>(); // переводим в ArrayList
        while (in.hasNext()) {
            ints.add(in.nextInt());
        }

        int sum = 0;
        int n = 0;
        for (int c : ints) {
            if (c % 2 == 0) {
                sum += c; // сумма чётных элементов
                n++; // число чётных элементов
            }
        }

        float medium = (float) sum / n; // среднее арифметическое элементов

        int pars = 0;
        int maxSum = 0;
        for (int i = 0; i < ints.size() - 1; i++) { // перебираем все пары(0 и 1 элемент, затем 1 и 2 и тд)
            // остановка на предпоследнем элементе, т.к. у последнего нет пары

            int a1 = ints.get(i);
            int a2 = ints.get(i + 1);

            if (((a1 % 3 == 0) || (a2 % 3 == 0)) && ((a1 < medium) || (a2 < medium))) { // проверяем условие
                pars++;
                maxSum = Math.max(maxSum, a1 + a2); // максимальную сумму
            }
        }

        System.out.println(pars);
        System.out.println(maxSum);
    }
}
