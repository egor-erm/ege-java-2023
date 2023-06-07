package ru.ermolay.num8;

import java.util.ArrayList;

public class Example5 {
    public static void main(String[] args) {
        String alp = "МАТВЕЙ";

        int otv = 0;
        for (char a : alp.toCharArray()) {
            if (a == 'Й') break;

            for (char b : alp.toCharArray()) {
                for (char c : alp.toCharArray()) {
                    for (char d : alp.toCharArray()) {
                        for (char e : alp.toCharArray()) {
                            for (char f : alp.toCharArray()) {
                                String word = "" + a + b + c + d + e + f;

                                if (word.contains("АЕ")) continue;

                                ArrayList<Character> arr = new ArrayList<>();
                                boolean ok = true;
                                for (Character w : word.toCharArray()) {
                                    if (arr.contains(w)) {
                                        ok = false;
                                        break;
                                    }

                                    arr.add(w);
                                }

                                if (!ok) continue;

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
