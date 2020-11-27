package com.mmks;

public class Main {

    public static final String SPACE = "";
    public static final String CHARACTER = "*";

    public static final String SYMBOL = SPACE + CHARACTER + SPACE;
    public static final String SEPARATOR = SPACE + " " + SPACE;

    public static void main(String[] args) {
        int count = 13;
        int mid = count / 2;
        for (int j = 0; j < count; j++) {
            System.out.print("   ");
            for (int i = 0; i < count; i++) {
                if (mid >= j) {
                    if ((i >= mid - j) && (i <= (mid + j))) {
                        System.out.print(SYMBOL);
                    } else {
                        System.out.print(SEPARATOR);
                    }
                } else {
                    if ((i < j - mid) || (i >= (count - (j - mid)))) {
                        System.out.print(SEPARATOR);
                    } else {
                        System.out.print(SYMBOL);
                    }
                }
            }
            System.out.println();
        }
    }
}
