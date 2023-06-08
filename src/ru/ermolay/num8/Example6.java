package ru.ermolay.num8;

public class Example6 {
    public static void main(String[] args) {
        String alf = "POLYGN";

        int otv = 0;
        for (char a : alf.toCharArray()) {
            for (char b : alf.toCharArray()) {
                for (char c : alf.toCharArray()) {
                    if (c == 'P' || c == 'L' || c == 'G' || c == 'N') {
                        continue;
                    }

                    for (char d : alf.toCharArray()) {
                        for (char e : alf.toCharArray()) {
                            if (a == e && b == d) {
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
