package ru.ermolay.num24;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Example4 {

    public static void main(String[] args) throws FileNotFoundException { // обязательно throws
        Scanner scanner = new Scanner(new File("src/ru/ermolay/num24/24-228.txt"));

        String s = scanner.nextLine();

        long max = 0;
        while (s.contains("SS")) {
            int i1 = s.indexOf("SS");
            int i2 = s.indexOf("SS", i1 + 2);

            System.out.println(i1 + " " + i2);

            if (i2 == -1) break;

            if (i2 - i1 != 13) {
                s = s.replaceFirst("SS", "");
                continue;
            }

            char[] arr = s.toCharArray();

            String num = "";
            boolean isNum = true;
            for (int i = i1 + 2; i < i2; i++) {
                if (!("" + arr[i]).equals(("" + arr[i]).toLowerCase(Locale.ROOT))) {
                    isNum = false;
                    s = s.replaceFirst("SS", "");
                    break;
                }

                num += arr[i];
            }

            if (!isNum) continue;

            if (num.length() == 11) {
                char[] na = num.toCharArray();
                if (na[0] == '1' && na[1] == '2' && na[6] == '7' && na[7] == '7' && na[10] == '9') {
                    long sd = Long.parseLong(num);
                    max = Math.max(max, sd);
                } else {
                    s = s.replaceFirst("SS", "");
                    continue;
                }
            }

            s = s.replaceFirst("SS", "");
        }

        int a1 = 0;
        int a2 = 1;
        for (char d : Long.toString(max).toCharArray()) {
            if (Integer.parseInt("" + d) % 2 == 0) {
                a2 *= Integer.parseInt("" + d);
            } else {
                a1 += Integer.parseInt("" + d);
            }
        }

        System.out.println(a1 + a2);
    }
}
