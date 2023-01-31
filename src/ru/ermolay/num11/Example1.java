package ru.ermolay.num11;

public class Example1 {

    public static void main(String[] args) {
        int alf = 26 + 26 + 10 + 9; // Заглавные и строчные буквы, цифры, символы

        int i = (int) Math.ceil(Math.log(alf) / Math.log(2)); // N = 2^i. i - это логарифм мощности(N) по основанию 2
        // Получается путём деления логарифмов с одинаковыми основаниями друг на друга(log2(N) = log10(N)/log10(2)). Округляем в большую сторону

        int code = 17 * i; // находим число битов
        int codeBytes = (int) Math.ceil(code / Math.pow(2, 3)); //переводим биты в байты, так как код кодируется мин возможным целым кол-вом байтов

        int num = (int) Math.ceil(Math.log(1200) / Math.log(2)); // сколько битов пойдёт на хранение кода подразделения
        int numBytes = (int) Math.ceil(num / Math.pow(2, 3)); // переводим биты в байты

        int info = 48 - codeBytes - numBytes; // вычитаем

        System.out.println(info);
    }
}
