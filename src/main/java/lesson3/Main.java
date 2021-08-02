package lesson3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

    }

    public static void switchFruits(Object[] array, int a, int b) {
        Object temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}
