package ru.ermolay.num24;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

public class Example1 {

    public static void main(String[] args) throws FileNotFoundException { // обязательно throws
        Scanner in = new Scanner(new File("src/ru/ermolay/num24/24.txt")); // читаем

        HashMap<Character, Integer> map = new HashMap<>();
        int a = 0;
        for (int i = 10; i < 36; i++) {
            String n = Integer.toString(i, 36);
            map.put(n.toCharArray()[0], a);
            a++;
        }

        ArrayList<String> lines = new ArrayList<>();
        while (in.hasNext()) {
            lines.add(in.nextLine().toLowerCase(Locale.ROOT));
        }

        int minG = 1000000;
        String nl = "";

        for (String line : lines) {
            int gc = 0;
            for (char c : line.toCharArray()) {
                if (c == 'g') {
                    gc++;
                }
            }

            if (gc < minG) {
                minG = gc;
                nl = line;
            }
        }

        HashMap<Character, Integer> chars = new HashMap<>();
        for (Character c : nl.toCharArray()) {
            if (chars.containsKey(c)) {
                chars.replace(c, chars.get(c) + 1);
                continue;
            }

            chars.put(c, 1);
        }

        int maxC = 0;
        char otv = 'a';
        for (Character key : chars.keySet()) {
            if (chars.get(key) >= maxC) {
                if (chars.get(key) == maxC) {
                    if (map.get(key) > map.get(otv)) {
                        otv = key;
                    }
                    continue;
                }

                maxC = chars.get(key);
                otv = key;
            }
        }

        System.out.println(otv);
    }
}
