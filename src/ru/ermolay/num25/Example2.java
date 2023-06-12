package ru.ermolay.num25;

public class Example2 {

    public static void main(String[] args) {
        int o = 0;
        for (int i = 452022; i < 10000000; i++) {
            int del = (int)Math.round(Math.sqrt(i));

            int mind = 0;
            int maxd = 0;

            for (int d = 2; d <= del; d++) {
                if (i % d == 0) {
                    mind = d;
                    maxd = i / d;
                    break;
                }
            }

            int m = mind + maxd;

            if (m % 7 == 3) {
                System.out.println(i + " " + m);
                o++;
            }

            if (o >= 5) {
                break;
            }
        }
    }
}
