package ru.ermolay.num12;

public class Example1 {

    public static void main(String[] args) {
        String str = "";
        for (int i = 0; i < 84; i++) {
            str += "1";
        }
        System.out.println("Debug: " + str.length());

        while (str.contains("11111")) {
            str = str.replaceFirst("222", "1");
            str = str.replaceFirst("111", "2");
        }

        System.out.println(str);
    }
}
