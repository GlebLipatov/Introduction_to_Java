package Introduction.HomeWorks.HW3;

import java.util.ArrayList;

public class Task1 {
    public static void solution() {
        System.out.println("1. Реализовать алгоритм сортировки слиянием(метод взять из Интернета)");

        ArrayList<Integer> numbers = GetNumbers.getList(20);
        Print.printList("Input list", numbers);
        numbers = mergeSort(numbers);
        Print.printList("Output list", numbers);
    }
    private static ArrayList<Integer> mergeSort(ArrayList<Integer> numbers) {
        if (numbers == null) return null;
        if (numbers.size() < 2) return numbers;

        ArrayList<Integer> leftList = new ArrayList<>(numbers.subList(0, numbers.size() / 2));
        ArrayList<Integer> rightList = new ArrayList<>(numbers.subList(numbers.size() / 2, numbers.size()));

        leftList = mergeSort(leftList);
        rightList = mergeSort(rightList);

        return mergeList(leftList, rightList);
    }
    private static ArrayList<Integer> mergeList(ArrayList<Integer> leftList, ArrayList<Integer> rightList) {
        int sizeMerge = leftList.size() + rightList.size();
        ArrayList<Integer> mergedList = new ArrayList<>(sizeMerge);

        int positionLeft = 0;
        int positionRight = 0;

        for (int i = 0; i < sizeMerge; i++) {
            if (positionLeft == leftList.size()) mergedList.add(rightList.get(positionRight++));
            else if (positionRight == rightList.size()) mergedList.add(leftList.get(positionLeft++));
            else if (leftList.get(positionLeft) < rightList.get(positionRight)) mergedList.add(leftList.get(positionLeft++));
            else mergedList.add(rightList.get(positionRight++));
        }
        return mergedList;
    }
}
