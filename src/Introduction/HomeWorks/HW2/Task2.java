package Introduction.HomeWorks.HW2;

import java.io.Console;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.*;

public class Task2 {
    private String task = "1. Реализуйте алгоритм сортировки пузырьком числового массива, " +
            "\nрезультат после каждой итерации запишите в лог-файл.";

    private int[] array = getArray(100);
    DoLog doLog;

    public void solution() {
        doLog = new DoLog(Task2.class);
        System.out.println(task);

        int temp;
        boolean isSorted = false;
        int iterCount = 1;
        while (!isSorted) {

            isSorted = true;
            for (int i = 1; i < array.length; i++) {
                String message = "Iter: " + iterCount++ + ": " + arrayToString(array);
                doLog.logging(message);
                if (array[i - 1] > array[i]) {
                    isSorted = false;
                    temp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = temp;
                }
            }
        }
    }

    private int[] getArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = size - i;
        }
        return array;
    }

    private String arrayToString(int[] array) {
        StringBuilder sb = new StringBuilder();
        for (int number : array) {
            sb.append(number).append(" ");
        }
        return sb.toString();
    }
}
