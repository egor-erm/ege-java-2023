package ru.ermolay.num25;

public class Example3 {

    public static void main(String[] args) {
        for (int n1 = 0; n1 <= 8; n1+=2) {
            for (int n2 = 1; n2 <= 9; n2+=2) {
                for (int n3 = 0; n3 <= 8; n3+=2) {
                    for (int n4 = 1; n4 <= 9; n4+=2) {
                        for (int n5 = 0; n5 <= 8; n5+=2) {
                            for (int n6 = 1; n6 <= 9; n6+=2) {
                                String num = "1" + n1 + n2 + n3 + n4 + n5 + n6;

                                int n = Integer.parseInt(num);
                                if (n % 4023 == 0) {
                                    System.out.println(n + " " + (n / 4023));
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
