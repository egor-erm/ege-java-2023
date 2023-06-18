package ru.ermolay.num5;

public class Example6 {

    public static void main(String[] args) {
        for (int n = 1; n <= 10000; n++) {
            String bin = Integer.toBinaryString(n);

            int sum = 0;
            for (char c : bin.toCharArray()) {
                if (c == '1') sum++;
            }

            if (sum % 2 == 0) {
                bin += 0;
                bin = bin.replaceFirst(""+ bin.toCharArray()[0] + bin.toCharArray()[1], "10");
            } else {
                bin += 1;
                bin = bin.replaceFirst(""+ bin.toCharArray()[0] + bin.toCharArray()[1], "11");
            }

            int r = Integer.parseInt(bin, 2);
            if (r >= 16) {
                System.out.println(n);
                return;
            }
        }
    }
}
