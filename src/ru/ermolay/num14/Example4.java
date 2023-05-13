package ru.ermolay.num14;

public class Example4 {

    public static void main(String[] args) { // 1001001000 - 7 нулей
        int a = (int) (125 + Math.pow(25, 3) + Math.pow(5, 9));

        String d = Integer.toString(a, 5);

        System.out.println(d);
    }
}
