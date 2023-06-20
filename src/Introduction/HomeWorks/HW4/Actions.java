package Introduction.HomeWorks.HW4;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Actions {
    Random rnd = new Random();

    /**
     * Fill list randome integers
     * @param list LinkedList
     * @param size Ineger
     * @return LinkedList
     */
    public LinkedList<Integer> fill(LinkedList<Integer> list, int size) {
        for (int i = 0; i < size; i++) {
            list.add(rnd.nextInt(10));
        }
        return list;
    }

    /**
     * Print elements and message
     * @param list List
     * @param message String
     */
    public void print(List list, String message) {
        System.out.println(message);
        System.out.println(list);
    }

    /**
     * Print element and message
     * @param word String
     * @param message String
     */
    public void print(String word, String message) {
        System.out.println(message);
        System.out.println(word);
    }

    /**
     * Print elements and message
     * @param array Integer[]
     * @param message String
     */
    public void print(Integer[] array, String message) {
        System.out.println(message);
        if (array != null && array.length > 0) {
            for (int element : array) {
                System.out.print(element + " ");
            }
            System.out.println();
        } else System.out.println("Stack is empty");
    }

    /**
     * Print boolean value and message
     * @param value Boolean
     * @param message String
     */
    public void print(boolean value, String message) {
        System.out.println(message + ": " + value);
    }

    /**
     * Print integer value and message
     * @param value Integer
     * @param message String
     */
    public void print(Integer value, String message) {
        System.out.println(message + ": " + value);
    }
}
