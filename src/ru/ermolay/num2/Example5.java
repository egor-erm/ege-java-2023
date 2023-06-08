package ru.ermolay.num2;

public class Example5 {

    public static void main(String[] args) { // y x z w
        System.out.println("x y z w F");
        for (int x = 0; x <= 1; x++) {
            for (int y = 0; y<= 1; y++) {
                for (int z = 0; z <= 1; z++) {
                    for (int w = 0; w <= 1; w++) {
                        if ((parseBool(x != 1) <= y) && (parseBool(y != 1) == z) && w == 1) {
                            System.out.println(x + " " + y + " " + z + " " + w + " 1");
                        }
                    }
                }
            }
        }
    }

    public static int parseBool(boolean ok) {
        if (ok) return 1;

        return 0;
    }
}
