package ru.ermolay.num17;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Example3 {

    public static void main(String[] args) throws FileNotFoundException { // обязательно throws
        Scanner scanner = new Scanner(new File("src/ru/ermolay/num17/17-298.txt"));

        ArrayList<Integer> ints = new ArrayList<>();
        while (scanner.hasNext()) {
            ints.add(scanner.nextInt());
        }

        int maxKrat = 0;
        for (int c : ints) {
            if (c % 197 == 0) {
                maxKrat = Math.max(maxKrat, c);
            }
        }

        int otv = 0;
        int maxOtv = 0;
        for (int i = 1; i < ints.size(); i++) {
            int e1 = ints.get(i);
            int e2 = ints.get(i - 1);

            int elems = 0;

            String e1s = "" + e1;
            String e2s = "" + e2;

            for (char c : e1s.toCharArray()) {
                if (c == '0') continue;

                if (Integer.parseInt("" + c) * 197 == e1) {
                    elems++;
                    break;
                }
            }

            for (char c : e2s.toCharArray()) {
                if (c == '0') continue;

                if (Integer.parseInt("" + c) * 197 == e2) {
                    elems++;
                    break;
                }
            }

            if (elems == 1 && e1 + e2 < maxKrat) {
                 otv++;
                 maxOtv = Math.max(maxOtv, e1 + e2);
            }
        }

        System.out.println(otv + " " + maxOtv);
    }
}
