package ru.ermolay.num12;

public class Example2 {

    public static void main(String[] args) {
        String num = "";
        for (int i = 0; i < 1000; i++) {
            num += 8;
        }

        while (num.contains("999") || num.contains("888")) {
            if (num.contains("888")) {
                num = num.replaceFirst("888", "9");
            } else {
                num = num.replaceFirst("999", "8");
            }
        }

        System.out.println(num);
    }
}
