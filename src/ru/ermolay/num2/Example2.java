package ru.ermolay.num2;

public class Example2 {

    public static void main(String[] args) { // z w y x
        System.out.println("x y z w F");
        for (int x = 0; x <= 1; x++) {
            for (int y = 0; y <= 1; y++) {
                for (int z = 0; z <= 1; z++) {
                    for (int w = 0; w <= 1; w++) {
                        if (((y <= z) || (x != 1 && w == 1)) == (w == z)) {
                            System.out.println(x + " " + y + " " + z + " " + w + " 1");
                        }
                    }
                }
            }
        }
    }
}
