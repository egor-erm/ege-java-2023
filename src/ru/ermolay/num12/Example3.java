package ru.ermolay.num12;

public class Example3 {

    public static void main(String[] args) {
        String a = "";
        for (int i = 0; i < 84; i++) {
            a += 1;
        }

        while (a.contains("11111")) {
            a = a.replaceFirst("222", "1");
            a = a.replaceFirst("111", "2");
        }

        System.out.println(a);
    }
}
