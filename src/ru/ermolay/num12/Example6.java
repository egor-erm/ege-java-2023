package ru.ermolay.num12;

public class Example6 {

    public static void main(String[] args) {
        String a = "1";
        for (int i = 1; i <= 80; i++) {
            a += "8";
        }

        while (a.contains("18") || a.contains("288") || a.contains("3888")) {
            if (a.contains("18")) {
                a = a.replaceFirst("18", "2");
            } else if (a.contains("288")) {
                a = a.replaceFirst("288", "3");
            } else {
                a = a.replaceFirst("3888", "1");
            }
        }

        System.out.println(a);
    }
}
