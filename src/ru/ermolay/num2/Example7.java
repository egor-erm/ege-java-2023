package ru.ermolay.num2;

public class Example7 {

    public static void main(String[] args) {
        System.out.println("x y z F");
        for (int x = 0; x <= 1; x++) {
            for (int y = 0; y <= 1; y++) {
                for (int z = 0; z <= 1; z++) {
                    if ((y <= z) && !(z == 1 && x == 1)) {
                        System.out.println(x + " " + y + " " + z + " 1");
                    }
                }
            }
        }
    }

    public static int parse(boolean ok) {
        if (ok) return 1;

        return 0;
    }
}
