package Introduction.HomeWorks.HW1;

import java.util.Arrays;

public class Task5 {
    static String message = "5. Во фразе \"Добро пожаловать на курс по Java\" переставить слова в обратном порядке.";

    public static void solution() {
        System.out.println("\n" + message);

        String input = "Добро пожаловать на курс по Java";
        String[] words = input.split(" ");
        String temp = "";
        int left = 0;
        int right = words.length - 1;

        while (left <= right) {
            temp = words[left];
            words[left] = words[right];
            words[right] = temp;

            left++;
            right--;
        }

        System.out.println("Before: " + input);
        System.out.println("After: " + String.join(" ", words));

    }
}
