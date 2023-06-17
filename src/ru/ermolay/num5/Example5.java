package ru.ermolay.num5;

public class Example5 {

    public static void main(String[] args) {
        for (int n = 1; n <= 10000; n++) {
            String bin = Integer.toBinaryString(n);

            bin = bin.replaceFirst("1", "");
            int count = 0;
            for (char a : bin.toCharArray()) {
                if (a == '1') {
                    count++;
                }
            }

            if (count % 2 == 0) {
                bin = "10" + bin;
            } else {
                bin = "1" + bin + "0";
            }

            int r = Integer.parseInt(bin, 2);

            System.out.println(r);
            if (r >= 450) return;
        }
    }
}
