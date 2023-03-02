package ru.ermolay.num8;

public class Example2 {

    public static void main(String[] args) {
        String[] alph = new String[]{"О", "Л", "Ь", "Г", "А"};

        int codesCount = 0;
        for (String a : alph) {
            if (a.equalsIgnoreCase("Ь")) continue;

            for (String b : alph) {
                if (a.contains(b)) continue;

                for (String c : alph) {
                    if ((a+b).contains(c)) continue;

                    for (String d : alph) {
                        if ((a+b+c).contains(d)) continue;

                        for (String e : alph) {
                            if ((a+b+c+d).contains(e)) continue;

                            String word = a + b + c + d + e;
                            if (word.charAt(word.indexOf("Ь") - 1) == 'Л' || word.charAt(word.indexOf("Ь") - 1) == 'Г')
                                codesCount++;
                        }
                    }
                }
            }
        }

        System.out.println(codesCount);
    }
}
