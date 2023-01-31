package ru.ermolay.num5;

public class Example1 {

    public static void main(String[] args) {
        int num = 0;
        while (true) {
            String binary = Integer.toBinaryString(num); // переводим число в строку с 0 и 1

            int bin = Integer.parseInt(binary); // получаем из строки число в десятичной системе("1001" -> 1001)
            if (bin % 2 == 0) {
                binary = "1" + binary + "0";
            } else {
                binary = "11" + binary + "11";
            }

            bin = Integer.parseInt(binary, 2); // перевод из двоичной системы в десятичную
            if (bin > 52) {
                System.out.println(num);
                return;
            }
            num++;
        }
    }
}
