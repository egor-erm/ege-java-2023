package ru.ermolay.num8;

public class Example4 {
    public static void main(String[] args) {
        String alp = "ИВАН";

        int vars = 0;
        for (char a : alp.toCharArray()) {
            for (char b : alp.toCharArray()) {
                for (char c : alp.toCharArray()) {
                    for (char d : alp.toCharArray()) {
                        for (char e : alp.toCharArray()) {
                            if (a == 'И' || b == 'И' || c == 'И' || d == 'И' || e == 'И') vars++;
                        }
                    }
                }
            }
        }

        System.out.println(vars);
    }
}
