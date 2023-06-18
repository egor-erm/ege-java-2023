package ru.ermolay.num14;

public class Example10 {

    public static void main(String[] args) {
        String a = "x23x5";
        String b = "67y9y";

        String alf1 = "";
        String alf2 = "";

        for (int i = 1; i < 22; i++) {
            alf1 += Integer.toString(i, 22);
        }

        for (int i = 0; i < 13; i++) {
            alf2 += Integer.toString(i, 13);
        }

        for (char x : alf1.toCharArray()) {
            for (char y : alf2.toCharArray()) {
                int otv = Integer.parseInt(a.replace('x', x), 22) - Integer.parseInt(b.replace('y', y), 13);

                if (otv % 57 == 0) {
                    int sum = Integer.parseInt("" + x, 22) + Integer.parseInt("" + y, 13);
                    System.out.println(sum + " " + (otv / 57) + " " + otv);
                }
            }
        }
    }
}
