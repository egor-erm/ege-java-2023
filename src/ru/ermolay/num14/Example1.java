package ru.ermolay.num14;

public class Example1 {

    public static void main(String[] args) {
        int s = 125 + (int)Math.pow(25, 3) + (int)Math.pow(5, 9);
        String f = Integer.toString(s, 5);

        int count = 0;
        for (char c : f.toCharArray()) {
            if (c == '0') {
                count++;
            }
        }

        System.out.println(count);
    }
}
