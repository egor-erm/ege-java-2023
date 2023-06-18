package ru.ermolay.num25;

public class Example4 {

    public static void main(String[] args) {
        String mask = "12*4?65";
        for (int x = 0; x < 10; x++) {
            String p = mask.replace("?", ""+x).replace("*", "");

            if (Integer.parseInt(p) % 161 == 0) {
                System.out.println(p + " " + (Integer.parseInt(p) / 161));
            }

            for (int y = 0; y < 100; y++) {
                if (y < 10) {
                    String g = mask.replace("?", ""+x).replace("*", "0"+y);

                    if (Integer.parseInt(g) % 161 == 0) {
                        System.out.println(g + " " + (Integer.parseInt(g) / 161));
                    }
                }

                String g = mask.replace("?", ""+x).replace("*", ""+y);

                if (Integer.parseInt(g) % 161 == 0) {
                    System.out.println(g + " " + (Integer.parseInt(g) / 161));
                }
            }
        }
    }
}
