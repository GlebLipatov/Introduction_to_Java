package Introduction.HomeWorks.HW1;

public class Task8 {
    static String message = "8. Задан массив, например, nums = [1,7,3,6,5,6]. \n" +
            "Написать программу, которая найдет индекс i для массива\n" +
            "такой, что сумма элементов с индексами < i равна сумме\n" +
            "элементов с индексами > i.";

    public static void solution() {
        System.out.println("\n" + message);

        int[] nums = new int[]{1, 7, 3, 6, 5, 6};
        int leftSum = 0;
        int rightSum = 0;
        int result = -1;

        for (int i = 1; i < nums.length; i++) {
            rightSum += nums[i];
        }

        for (int i = 1; i < nums.length; i++) {
            leftSum += nums[i - 1];
            rightSum -= nums[i];
            if (leftSum == rightSum) {
                result = i;
                break;
            }
        }

        if (result > 0) System.out.println("i = "+ result);
        else System.out.println("There is no such i.");

    }
}
