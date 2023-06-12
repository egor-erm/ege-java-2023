package ru.ermolay.num26;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Example1 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("src/ru/ermolay/num26/26.txt"));

        int gr = scanner.nextInt();
        int n = scanner.nextInt();

        ArrayList<Integer> cont = new ArrayList<>();
        while (scanner.hasNext()) {
            cont.add(scanner.nextInt());
        }

        Collections.sort(cont);
        System.out.println(cont.get(cont.size()-1));

        int maxW = 0;

        int mas = 0;
        int c = 0;
        while (mas < gr) {
            if (mas + cont.get(c) > gr) {
                System.out.println(c);
                mas -= cont.get(c - 1);

                int bal = gr - mas;
                for (int i = c; i < n; i++) {
                    if (cont.get(i) > bal) {
                        System.out.println(maxW);
                        return;
                    }

                    maxW = cont.get(i);
                }

                System.out.println(maxW);

                return;
            }

            mas += cont.get(c);
            c++;
        }
    }
}
