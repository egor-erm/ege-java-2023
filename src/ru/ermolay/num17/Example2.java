package ru.ermolay.num17;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Example2 {

    public static void main(String[] args) throws FileNotFoundException { // обязательно throws
        Scanner scanner = new Scanner(new File("src/ru/ermolay/num17/17-1.txt"));

        ArrayList<Integer> ints = new ArrayList<>();
        while (scanner.hasNext()) {
            ints.add(scanner.nextInt());
        }

        int sums = 0;
        int maxSum = 0;

        for (int i = 0; i < ints.size() - 3; i++) {
            int x = ints.get(i);
            int y = ints.get(i + 1);
            int z = ints.get(i + 2);

            int max = Math.max(Math.max(x, y), z);
            int kvMax = 0;
            int kvSum = 0;

            if (max == x) {
                kvMax = (int) Math.pow(x, 2);
                kvSum = (int) (Math.pow(y, 2) + Math.pow(z, 2));
            } else if (max == y) {
                kvMax = (int) Math.pow(y, 2);
                kvSum = (int) (Math.pow(x, 2) + Math.pow(z, 2));
            } else if (max == z) {
                kvMax = (int) Math.pow(z, 2);
                kvSum = (int) (Math.pow(x, 2) + Math.pow(y, 2));
            }

            if (kvMax < kvSum) {
                sums++;
                maxSum = Math.max(maxSum, x + y + z);
            }
        }

        System.out.println(sums + " " + maxSum);
    }
}
