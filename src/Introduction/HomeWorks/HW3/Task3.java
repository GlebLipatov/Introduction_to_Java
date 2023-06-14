package Introduction.HomeWorks.HW3;

import java.util.ArrayList;

public class Task3 {

    public static void solution() {
        System.out.println("3. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.");

        ArrayList<Integer> numbers = GetList.getList(10);
        Print.printList("Input list", numbers);
        Integer minValue = getMinValue(numbers);
        Print.printInteger("Min value: " , minValue);
        Integer maxValue = getMaxValue(numbers);
        Print.printInteger("Max value: " , maxValue);
        Integer averageValue = getAverageValue(numbers);
        Print.printInteger("Average value: " , averageValue);
    }

    private static Integer getAverageValue(ArrayList<Integer> list) {
        Integer averageValue = 0;
        for (Integer number : list) {
            averageValue += number;
        }
        return averageValue / list.size();
    }

    private static Integer getMaxValue(ArrayList<Integer> list) {
        Integer maxValue = Integer.MIN_VALUE;
        for (Integer number : list) {
            if (maxValue < number) maxValue = number;
        }
        return maxValue;
    }

    private static Integer getMinValue(ArrayList<Integer> list) {
        Integer minValue = Integer.MAX_VALUE;
        for (Integer number : list) {
            if (minValue > number) minValue = number;
        }
        return minValue;
    }


}
