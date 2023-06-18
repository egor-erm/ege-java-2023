package ru.ermolay.num8;

public class Example8 {
    public static void main(String[] args) {
        String alf = "ЭФЕКТ";

        int otv = 0;
        for (char a : alf.toCharArray()) {
            for (char b : alf.toCharArray()) {
                if (b == a) continue;

                for (char c : alf.toCharArray()) {
                    if (c == a || c == b) continue;

                    for (char d : alf.toCharArray()) {
                        if (d == a || d == b || d == c) continue;

                        for (char e : alf.toCharArray()) {
                            if (e == a || e == b || e == c || e == d) continue;

                            boolean da = true;
                            String word = "" + a + b + c + d + e;

                            int i1 = word.indexOf("Е");
                            int i2 = word.indexOf("Э");
                            int i3 = word.indexOf("К");
                            int i4 = word.indexOf("Т");
                            int i5 = word.indexOf("Ф");

                            if ((i1 < i2) &&(i3 > i4 && i4 > i5)) {
                                otv++;
                            }
                        }
                    }
                }
            }
        }

        System.out.println(otv);
    }
}
