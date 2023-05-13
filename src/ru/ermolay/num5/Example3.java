package ru.ermolay.num5;

public class Example3 {

    public static void main(String[] args) {
        for (int N = 1; N <= 10000; N++) {
            String n = Integer.toBinaryString(N);

            if (n.toCharArray()[n.length() - 1] == '0') {
                n = 1 + n + 0;
            } else {
                n = 11 + n + 11;
            }

            if (Integer.parseInt(n, 2) > 52) {
                System.out.println(N);
                return;
            }
        }
    }
}
