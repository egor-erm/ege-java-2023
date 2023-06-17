package ru.ermolay.num8;

public class Example7 {
    public static void main(String[] args) { // бесконечная рекурсия кек, решать руками
        String alf = "АНТИУОПЯ";

        int otv = 0;
        for (char a1 : alf.toCharArray()) {
            for (char a2 : alf.toCharArray()) {
                for (char a3 : alf.toCharArray()) {
                    for (char a4 : alf.toCharArray()) {
                        for (char a5 : alf.toCharArray()) {
                            for (char a6 : alf.toCharArray()) {
                                for (char a7 : alf.toCharArray()) {
                                    for (char a8 : alf.toCharArray()) {
                                        for (char a9 : alf.toCharArray()) {
                                            for (char a10 : alf.toCharArray()) {
                                                for (char a11 : alf.toCharArray()) {
                                                    for (char a12 : alf.toCharArray()) {
                                                        for (char a13 : alf.toCharArray()) {
                                                            for (char a14 : alf.toCharArray()) {
                                                                for (char a15 : alf.toCharArray()) {
                                                                    for (char a16 : alf.toCharArray()) {
                                                                        String word = "" + a1 + a2 + a3 + a4 + a5 + a6 + a7 + a8 + a9 + a10 + a11 + a12 + a13 + a14 + a15 + a16;

                                                                        if (word.contains("АНТИУТОПИЯ")) otv++;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        System.out.println(otv);
    }
}
