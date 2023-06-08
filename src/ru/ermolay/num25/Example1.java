package ru.ermolay.num25;

public class Example1 {

    public static void main(String[] args) {
        for (int i = 45000000; i <= 50000000; i++) {
            int del = (int)Math.round(Math.sqrt(i));

            int dels = 0;
            for (int d = 1; d < del; d++) {
                if (i % d == 0) {
                    if (d % 2 != 0) dels++;

                    if ((i / d) % 2 != 0) dels++;

                    if (d == (i / d)) dels--;
                }

                if (dels > 5) break;
            }

            if (dels == 5) System.out.println(i);
        }
    }
}
