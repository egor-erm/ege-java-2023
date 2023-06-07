package ru.ermolay.num24;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

public class Example2 {

    public static void main(String[] args) throws FileNotFoundException { // обязательно throws
        Scanner scanner = new Scanner(new File("src/ru/ermolay/num24/24-2.txt")); // читаем

        String alf = "";
        while (scanner.hasNext()) {
            alf += scanner.nextLine();
        }

        int max = 0;
        String word = "";
        for (char a : alf.toCharArray()) {
            if (word.length() >= 4) {
                char[] wd = word.toCharArray();

                if (a == 'Y' && wd[wd.length-1] == 'Z' && wd[wd.length-2] == 'Z' && wd[wd.length-3] == 'X') {
                    max = Math.max(max, wd.length);
                    word = "ZZY";
                    continue;
                }
            }

            word += a;
        }

        System.out.println(max);
    }
}
