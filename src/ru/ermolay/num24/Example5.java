package ru.ermolay.num24;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class Example5 {

    public static void main(String[] args) throws FileNotFoundException { // обязательно throws
        Scanner scanner = new Scanner(new File("src/ru/ermolay/num24/24-215.txt"));

        char[] line = scanner.nextLine().toCharArray();

        int max = 0;
        int t = 0;
        for (int i = 0; i < line.length - 2; i++) {
            if (isLetter(line[i]) && !isLetter(line[i+1]) && isLetter(line[i+2])) {
                t++;
                i += 2;
                continue;
            }

            if (t != 0) {
                i -= 3;
                max = Math.max(max, t);
                t = 0;
            }
        }

        max = Math.max(max, t);

        System.out.println(max);
    }

    public static boolean isLetter(char a) {
        if (("" + a).toLowerCase(Locale.ROOT).equals("" + a)) return false;

        return true;
    }
}
