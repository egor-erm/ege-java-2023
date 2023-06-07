package ru.ermolay.num17;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Example4 {

    public static void main(String[] args) throws FileNotFoundException { // обязательно throws
        Scanner scanner = new Scanner(new File("src/ru/ermolay/num17/17-1.txt"));

        ArrayList<Integer> list = new ArrayList();
        while (scanner.hasNext()) {
            list.add(scanner.nextInt());
        }

        int sum = 0;
        int count = 0;
        for (Integer a : list) {
            if (a % 2 == 0) {
                sum+=a;
                count++;
            }
        }

        double sr = (double)sum / count;

        int otv1 = 0;
        int otv2 = 0;
        for (int i = 1; i < list.size(); i++) {
            int a = list.get(i - 1);
            int b = list.get(i);

            if ((a % 3 == 0 || b % 3 == 0) && (a < sr || b < sr)) {
                otv1++;
                otv2 = Math.max(a + b, otv2);
            }
        }

        System.out.println(otv1 + " " + otv2);
    }
}
