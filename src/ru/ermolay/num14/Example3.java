package ru.ermolay.num14;

public class Example3 {

    public static void main(String[] args) {
        int a = (int) Math.pow(9, 8) + (int)Math.pow(3, 5) - 9;
        String as = Integer.toString(a, 3);

        int count = 0;
        for (char c : as.toCharArray()) {
            if (c == '2') count++;
        }

        System.out.println(count);
    }
}
