package ru.ermolay.num5;

public class Example4 {

    public static void main(String[] args) {
        int otv = 0;
        for (int N = 1000; N <= 9999; N++) {
            String num = "" + N;

            int first = Integer.parseInt(num.toCharArray()[0] + "");
            if (first % 4 == 0) {
                num = "9" + num.toCharArray()[1] + num.toCharArray()[2] + num.toCharArray()[3];
            } else if (first % 2 == 0) {
                num = "3" + num.toCharArray()[1] + num.toCharArray()[2] + num.toCharArray()[3];
            }

            int num2 = Integer.parseInt(num);
            String v = Integer.toString(num2, 8);
            if (num.toCharArray()[0] == '9' && v.toCharArray()[v.toCharArray().length-1] == '4') {
                otv++;
            }
        }

        System.out.println(otv);
    }
}
