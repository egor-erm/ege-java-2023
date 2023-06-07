package ru.ermolay.num12;

public class Example4 {

    public static void main(String[] args) {
        String a = "";
        for (int i = 1; i <= 1000; i++) {
            a += "9";
        }

        while (a.contains("999") || a.contains("888")) {
            if (a.contains("888")) {
                a = a.replaceFirst("888", "9");
            } else {
                a = a.replaceFirst("999", "8");
            }
        }

        System.out.println(a);
    }
}
