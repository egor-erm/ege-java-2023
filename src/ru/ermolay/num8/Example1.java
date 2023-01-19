package ru.ermolay.num8;

public class Example1 {

    public static void main(String[] args) {
        String[] alph = new String[]{"И", "В", "А", "Н"};

        int codesCount = 0;
        for (String a : alph) {
            for (String b : alph) {
                for (String c : alph) {
                    for (String d : alph) {
                        for (String e : alph) {
                            String code = a + b + c + d + e;

                            if (code.contains("И")) {
                                codesCount++;
                            }
                        }
                    }
                }
            }
        }

        System.out.println(codesCount);
    }
}
