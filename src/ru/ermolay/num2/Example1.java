package ru.ermolay.num2;

public class Example1 {

    public static void main(String[] args) {
        System.out.println("x y z w"); // перебор всех значений
        for (int x = 0; x <= 1; x++) {
            for (int y = 0; y <= 1; y++) {
                for (int z = 0; z <= 1; z++) {
                    for (int w = 0; w <= 1; w++) {
                        if (!((x == parseInt(w == 1 || y == 1)) || ((w <= z) && (y <= w)))) { // импликация выглядит как <=
                            System.out.println(x + " " + y + " " + z + " " + w);
                        }
                    }
                }
            }
        }
    }

    private static int parseInt(boolean yes) {
        if (yes) return 1;

        return 0;
    }

}
