package ru.ermolay.num12;

import java.util.ArrayList;
import java.util.Collections;

public class Example7 {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i <= 203; i++) {
            String word = "";
            for (int x = 0; x < i; x++) {
                word += 1;
            }

            word += 2;

            for (int y = i + 1; y <= 203; y++) {
                word += "1";
            }

            while (word.contains("111") || word.contains("222")) {
                if (word.contains("111")) {
                    word = word.replaceFirst("111", "22");
                } else {
                    word = word.replaceFirst("222", "11");
                }
            }

            arr.add(Integer.parseInt(word));
        }

        Collections.sort(arr);
        System.out.println(arr.get(arr.size()-1));
    }
}
