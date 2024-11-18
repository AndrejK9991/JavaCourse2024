package it.step;

import java.util.Arrays;

public class Homework_Lots_Of_Tasks {
    public static void main(String[] args) {

        // Задание 1.   Линейный поиск.
        int [] array1 = {1, 2, 3, 4, 5};
        int target1 = 4;
        System.out.println ("Задание 1. Линейный поиск. Результат: " + linearSearch(array1, target1));

        // Задание 2. Двоичный поиск
        int [] array2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target2 = 5;
        System.out.println ("Задание 2. Двоичный поиск. Результат: " + binarySearch(array2, target2, 0, array2.length - 1));

        // Задание 3. Пузырьковая сортировка
        int [] array3 = {5, 2, 8, 4, 9};
        System.out.println ("Задание 3. Пузырьковая сортировка. Результат: " + Arrays.toString(bubbleSort(array3)));

        // Задание 4. Проверка строки на палиндром
        String str4 = "radar";
        System.out.println ("Задание4. Проверка строки на палиндром. Результат: " + isPalindrome(str4));

        // Задание 5. Факториал числа
        int n5 = 3;
        System.out.println ("Задание5. Факториал числа. Результат: " + factorial(n5));

        // Задание 7. Поиск числа Фибоначчи
        int n7 = 7;
        System.out.println ("Задание7.1. Поиск числа Фибоначчи с использованием рекурсии. Результат: " + fibonacciRecursive(n7));
        System.out.println ("Задание7.2. Поиск числа Фибоначчи с использованием цикла. Результат: " + fibonacciIterative(n7));

        // Задание 9. Удаление дубликатов из массива
        int [] array9 = {2, 3, 3, 5, 5, 7, 2};
        System.out.println ("Задание 9. Удаление дубликатов из массива. Результат: " + Arrays.toString(removeDuplicates(array9)));
    }

    // Задание 1. Линейный поиск.
    // Напишите алгоритм для поиска числа в массиве.
    // Возвращает индекс target1 в массиве array1 или -1.
    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i; // возвращаем индекс элемента, если он найден
            }
        }
        return -1; // возвращаем -1, если элемент не найден
    }

    // Задание 2. Двоичный поиск.
    // Реализуйте двоичный поиск для отсортированного массива.
    // Напишите метод с использованием рекурсии или цикла, который вернёт индекс target2 или -1.
    public static int binarySearch(int[] sortedArray, int valueToFind, int low, int high) {
        int index = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (sortedArray[mid] < valueToFind) {
                low = mid + 1;
            } else if (sortedArray[mid] > valueToFind) {
                high = mid - 1;
            } else if (sortedArray[mid] == valueToFind) {
                index = mid;
                break;
            }
        }
        return index;
    }

    // Задание 3. Пузырьковая сортировка.
    public static int [] bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j - 1] > array[j]) {
                    int tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                }
            }
        }
        return array;
    }

    // Задание 4. Проверка строки на палиндром.
    public static boolean isPalindrome(String str) {
        int length = str.length();
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    // Задание 5. Факториал числа.
    public static int factorial(int x) {
        if (x==0){
            x=1;
        } else if (x<0) {
            System.out.println("Неверное число!");
        }
        else{
            for (int i = (x-1); i > 1; i--){
                x = x * i;}
        }
        return x;
    }

    // Задание 7.1 Поиск числа Фибоначчи с использованием рекурсии.
    public static int fibonacciRecursive(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else if (n < 0) {
            System.out.println("Неверное число!");
            return -99999;
        } else {
            return fibonacciRecursive(n-1) + fibonacciRecursive(n - 2);
        }
    }

    // Задание 7.2 Поиск числа Фибоначчи с использованием цикла.
    public static long fibonacciIterative(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else if (n < 0) {
            System.out.println("Неверное число!");
            return -99999;
        } else {
            long n0 = 0L;
            long n1 = 1L;
            for (int i = 2; i <= n; i++) {
                long n2 = n0 + n1;
                n0 = n1;
                n1 = n2;
            }
            return n1;
        }
    }

    // Задание 9. Удаление дубликатов из массива.
    public static int [] removeDuplicates(int[] array) {
            int n = array.length;
            for ( int i = 0, m = 0; i != n; i++, n = m ) {
                for ( int j = m = i + 1; j != n; j++ ) {
                    if ( array[j] != array[i] ) {
                        if ( m != j ) {
                            array[m] = array[j];
                        }
                        m++;
                    }
                }
            }

            if ( n != array.length )
            {
                int[] b = new int[n];
                for ( int i = 0; i < n; i++ ) {
                    b[i] = array[i];
                }
                array = b;
            }
        return array;
    }


}
