package Introduction.HomeWorks.HW2;

import java.io.Console;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.*;

public class Task2 {
    private static String task = "1. Реализуйте алгоритм сортировки пузырьком числового массива, " +
            "\nрезультат после каждой итерации запишите в лог-файл.";

    private static int[] array = new int[]{5, 4, 3, 2, 1, 0};

    public static void solution() {
        System.out.println(task);

        int temp;
        boolean isSorted = true;
        FileHandler fileHandler;
        Logger logger = Logger.getLogger(Task2.class.getName());
        SimpleFormatter simpleFormatter = new SimpleFormatter();
        try {
            fileHandler = new FileHandler("src/Introduction/HomeWorks/HW2/log.txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        while (isSorted) {
            doLog(array, logger, fileHandler, simpleFormatter);
            isSorted = false;
            for (int i = 1; i < array.length; i++) {
                if (array[i - 1] > array[i]) {
                    isSorted = true;
                    temp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = temp;
                }
            }
        }
    }

    private static void doLog(int[] arr,
                              Logger logger,
                              Handler handler,
                              Formatter formatter) {
        logger.addHandler(handler);
        handler.setFormatter(formatter);
        logger.info(String.join(" ", arrayToString(arr)));
    }

    private static String arrayToString(int[] array) {
        StringBuilder sb = new StringBuilder();
        for (int number : array) {
            sb.append(number).append(" ");
        }
        return sb.toString();
    }
}
