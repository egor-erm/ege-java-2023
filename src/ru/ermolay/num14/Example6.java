package ru.ermolay.num14;

public class Example6 {

    public static void main(String[] args) { // 1001001000 - 7 нулей
        String alph15 = "0123456789abcde";
        String num1 = "123x5";
        String num2 = "1x233";

        for (char a : alph15.toCharArray()) {
            String n1 = num1.replace('x', a);
            String n2 = num2.replace('x', a);

            int c1 = Integer.parseInt(n1, 15);
            int c2 = Integer.parseInt(n2, 15);
            int o = c1 + c2;

            if (o % 14 == 0) {
                int otv = o / 14;
                System.out.println(otv);
                return;
            }
        }
    }
}
