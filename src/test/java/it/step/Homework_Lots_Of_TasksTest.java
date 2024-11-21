package it.step;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Homework_Lots_Of_TasksTest {

    @Test
    void factorial() {
        int expected = 6;
        int actual = Homework_Lots_Of_Tasks.factorial(3);
        assertEquals(expected, actual);
    }

    @Test
    void fibonacciRecursive() {
        int expected = 13;
        int actual = Homework_Lots_Of_Tasks.fibonacciRecursive(7);
        assertEquals(expected, actual);
    }

    @Test
    void fibonacciIterative() {
        int expected = 13;
        long actual = Homework_Lots_Of_Tasks.fibonacciIterative(7);
        assertEquals(expected, actual);
    }

    @Test
    void linearSearch() {
        int expected = 3;
        int [] array = {1, 2, 3, 4, 5};
        int target = 4;
        int actual = Homework_Lots_Of_Tasks.linearSearch(array, target);
        assertEquals(expected, actual);
    }

    @Test
    void binarySearch() {
        int expected = 4;
        int [] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 5;
        int actual = Homework_Lots_Of_Tasks.binarySearch(array, target, 0, array.length - 1);
        assertEquals(expected, actual);
    }

    @Test
    void bubbleSort() {
        int[] expected = {2, 4, 5, 8, 9};
        int[] array = {5, 2, 8, 4, 9};
        int[] actual = Homework_Lots_Of_Tasks.bubbleSort(array);
        assertArrayEquals(expected, actual);
    }

    @Test
    void isPalindrome() {
        boolean actual = Homework_Lots_Of_Tasks.isPalindrome("radar");
        assertTrue(actual);
    }

    @Test
    void removeDuplicates() {
        int[] expected = {2, 3, 5, 7};
        int[] array = {2, 3, 3, 5, 5, 7, 2};
        int[] actual = Homework_Lots_Of_Tasks.removeDuplicates(array);
        assertArrayEquals(expected, actual);
    }

}