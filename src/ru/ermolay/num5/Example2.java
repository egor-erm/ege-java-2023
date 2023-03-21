package ru.ermolay.num5;

public class Example2 {

    public static void main(String[] args) {
        for (int a = 10000; a < 100000; a++) {
            String as = a + "";

            int f = Integer.parseInt(as.toCharArray()[0] + "")
                    + Integer.parseInt(as.toCharArray()[2] + "")
                    + Integer.parseInt(as.toCharArray()[4] + "");

            int s = Integer.parseInt(as.toCharArray()[1] + "")
                    + Integer.parseInt(as.toCharArray()[3] + "");

            if ((f == 7 && s == 23) || (s == 7 && f == 23)) {
                System.out.println(a);
                return;
            }
        }
    }
}
