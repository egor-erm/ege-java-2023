package ru.ermolay.num25;

public class Example1 {

    public static void main(String[] args) {
        for (int i = 45000000; i <= 50000000; i++) {


            if (i % 2 == 0) {
                int del = i / 2;

                int dels = 0;
                for (int d = 1; d <= del; d+=2) {
                    if (i % d == 0) {
                        dels++;
                    }

                    if (dels >= 6) break;
                }

                if (dels == 5) {
                    System.out.println(i);
                }
            } else {
                int del = (int)Math.floor((float)i / 2);
                int dels = 0;
                for (int d = 1; d <= del; d+=2) {
                    if (i % d == 0) {
                        dels++;
                    }

                    if (dels >= 5) break;
                }

                if (dels == 4) {
                    System.out.println(i);
                }
            }
        }
    }
}
