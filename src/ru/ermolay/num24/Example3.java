package ru.ermolay.num24;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Example3 {

    public static void main(String[] args) throws FileNotFoundException { // обязательно throws
        Scanner scanner = new Scanner(new File("src/ru/ermolay/num24/24.txt"));

        ArrayList<String> list = new ArrayList<>();
        while (scanner.hasNext()) {
            list.add(scanner.next());
        }

        String minL = list.get(0);
        for (String line : list) {
            if (count(line, 'N') < count(minL, 'N')) {
                minL = line;
            }
        }

        ArrayList<Character> chars = new ArrayList<>();
        for (char w : minL.toCharArray()) {
            if (!chars.contains(w)) chars.add(w);
        }

        char otv = 'A';
        for (char w : chars) {
            if (count(minL, w) > count(minL, otv)) {
                otv = w;
            } else if (count(minL, w) == count(minL, otv)) {
                if (((int) w) > ((int) otv)) {
                    otv = w;
                }
            }
        }

        System.out.println(otv);
    }

    public static int count(String s, char c) {
        int count = 0;
        for (char d : s.toCharArray()) {
            if (d == c) count++;
        }

        return count;
    }
}
