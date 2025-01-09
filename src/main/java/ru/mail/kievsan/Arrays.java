package ru.mail.kievsan;

import java.util.Comparator;

public class Arrays {

    // 1. Выполняет поиск указанного значения в заданном массиве байтов с помощью алгоритма двоичного поиска.
    public static int binarySearch(byte[] a, byte key) {
        return java.util.Arrays.binarySearch(a, 0, a.length, key);
    }

    // 2. Выполняет поиск в диапазоне указанного массива байтов заданного значения с помощью алгоритма двоичного поиска
    public static int binarySearch(byte[] a, int fromIndex, int toIndex, byte key) {
        return java.util.Arrays.binarySearch(a, fromIndex, toIndex, key);
    }

    // 3. Выполняет поиск указанного значения в заданном массиве символов с помощью алгоритма двоичного поиска
    public static int binarySearch(char[] a, char key) {
        return java.util.Arrays.binarySearch(a, key);
    }

    // 4. Выполняет поиск в диапазоне указанного массива символов заданного значения с помощью алгоритма двоичного поиска
    public static int binarySearch(char[] a, int fromIndex, int toIndex, char key) {
        return java.util.Arrays.binarySearch(a, fromIndex, toIndex, key);
    }

    // 5. Выполняет поиск заданного значения в указанном массиве чисел с плавающей запятой с помощью алгоритма двоичного поиск
    public static int binarySearch(double[] a, double key) {
        return java.util.Arrays.binarySearch(a, key);
    }

    // 6. Выполняет поиск в диапазоне указанного массива чисел с плавающей запятой заданного значения с помощью алгоритма двоичного поиск
    public static int binarySearch(double[] a, int fromIndex, int toIndex, double key) {
        return java.util.Arrays.binarySearch(a, fromIndex, toIndex, key);
    }

    // 7. Выполняет поиск указанного значения в заданном массиве чисел с плавающей запятой с помощью алгоритма двоичного поиска
    public static int binarySearch(float[] a, float key) {
        return java.util.Arrays.binarySearch(a, key);
    }

    // 8. Выполняет поиск в диапазоне указанного массива чисел с плавающей запятой заданного значения с помощью алгоритма двоичного поиска
    public static int binarySearch(float[] a, int fromIndex, int toIndex, float key) {
        return java.util.Arrays.binarySearch(a, fromIndex, toIndex, key);
    }

    // 9. Выполняет поиск указанного значения в заданном массиве целых чисел с помощью алгоритма двоичного поиска
    public static int binarySearch(int[] a, int key) {
        return java.util.Arrays.binarySearch(a, key);
    }

    // 10.Выполняет поиск в диапазоне указанного массива целых чисел по заданному значению с помощью алгоритма двоичного поиска
    public static int binarySearch(int[] a, int fromIndex, int toIndex, int key) {
        return java.util.Arrays.binarySearch(a, fromIndex, toIndex, key);
    }

    // 11.Выполняет поиск указанного значения в заданном массиве целых чисел с помощью алгоритма двоичного поиска
    public static int binarySearch(long[] a, long key) {
        return java.util.Arrays.binarySearch(a, key);
    }

    // 12.Выполняет поиск в диапазоне указанного массива целых чисел заданного значения с помощью алгоритма двоичного поиска
    public static int binarySearch(long[] a, int fromIndex, int toIndex, long key) {
        return java.util.Arrays.binarySearch(a, fromIndex, toIndex, key);
    }

    // 13.Выполняет поиск заданного значения в указанном массиве шорт с помощью алгоритма двоичного поиска
    public static int binarySearch(short[] a, short key) {
        return java.util.Arrays.binarySearch(a, key);
    }

    // 14.Выполняет поиск в диапазоне указанного массива шорт заданного значения с помощью алгоритма двоичного поиска
    public static int binarySearch(short[] a, int fromIndex, int toIndex, short key) {
        return java.util.Arrays.binarySearch(a, fromIndex, toIndex, key);
    }

    // 15.Выполняет поиск указанного объекта в указанном массиве с использованием алгоритма двоичного поиска
    public static <T> int binarySearch(T[] a, T key, Comparator<? super T> c) {
        return java.util.Arrays.binarySearch(a, key, c);
    }

    // 16.Выполняет поиск в указанном диапазоне массива указанного объекта с помощью алгоритма двоичного поиска
    public static <T> int binarySearch(T[] a, int fromIndex, int toIndex, T key, Comparator<? super T> c) {
        return java.util.Arrays.binarySearch(a, fromIndex, toIndex, key, c);
    }
}

// https://docs.oracle.com/javame/config/cldc/opt-pkgs/api/cldc/api/java/util/Arrays.html
