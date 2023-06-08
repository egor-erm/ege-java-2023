package ru.ermolay.num14;

public class Example8 {

    public static void main(String[] args) {
        String n1 = "273x2";
        String n2 = "1x390";

        int sum = 0;
        for (int x = 0; x < 158; x++) {
            String b = Integer.toString(x, 158);

            int a1 = Integer.parseInt(n1.replace("x", b), 158);
            int a2 = Integer.parseInt(n2.replace("x", b), 158);

            if (a1 + a2 % 73 == 0) {
                sum += (a1 + a2) / 73;
            }
        }

        System.out.println(sum);
    }
}
