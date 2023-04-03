package ru.ermolay.num8;

public class Example3 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5};

        int variants = 0;
        for (int a : array) {
            for (int b : array) {
                for (int c : array) {
                    for (int d : array) {
                        for (int e : array) {
                            String pass = "" + a + b + c + d + e;

                            int oneCount = 0;
                            for (char f : pass.toCharArray()) {
                                if (f == '1') oneCount++;
                            }

                            if (oneCount == 3) {
                                variants++;
                            }
                        }
                    }
                }
            }
        }

        System.out.println(variants);
    }
}
