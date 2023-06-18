package ru.ermolay.num17;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Example6 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("src/ru/ermolay/num17/17-336.txt"));

        ArrayList<Integer> list = new ArrayList<>();
        while (scanner.hasNext()) {
            list.add(scanner.nextInt());
        }

        int m = 0;
        for (int a : list) {
            if (a % 37 == 0) {
                m = Math.max(m, a);
            }
        }

        int count = 0;
        int min = 1000000000;
        for (int i = 1; i < list.size(); i++) {
            int n1 = list.get(i - 1);
            int n2 = list.get(i);

            if (n1 % m == 0 || n2 % m == 0) {
                if (((n1 + n2) % m) > 30) {
                    count++;
                    min = Math.min(min, n1 + n2);
                }
            }
        }

        System.out.println(count + " " + min);
    }
}
