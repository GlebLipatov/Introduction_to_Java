package Introduction.HomeWorks.HW4.Java;

import java.util.LinkedList;

public class Task1 {

    public void solution(){
        String task = "1. Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.";
        System.out.println(task);

        ListActions action = new ListActions();
        LinkedList<Integer> numbers = action.fill(new LinkedList<>(), 10);
        action.print(numbers, "Before:");
        numbers = reverseByValue(numbers);
        action.print(numbers, "After:");
    }

    private LinkedList<Integer> reverseByValue(LinkedList<Integer> list) {
        int temp;
        int left = 0;
        int right = list.size() - 1;

        while (left < right) {
            temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);

            left++;
            right--;
        }
        return list;
    }
}
