package ru.ermolay.num17;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Example5 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("src/ru/ermolay/num17/17-2.txt"));

        ArrayList<Integer> nums = new ArrayList<>();
        while (scanner.hasNext()) {
            nums.add(scanner.nextInt());
        }

        int otv1 = 0;
        int otv2 = 0;
        for (int i = 0; i < nums.size() - 1; i++) {
            for (int j = i + 1; j < nums.size(); j++) {
                if ((nums.get(i) - nums.get(j)) % 60 == 0) {
                    otv1++;

                    otv2 = Math.max(otv2, Math.abs(nums.get(i) - nums.get(j)));
                }
            }
        }

        System.out.println(otv1 + " " + otv2);
    }
}
