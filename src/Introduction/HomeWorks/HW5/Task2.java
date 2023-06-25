package Introduction.HomeWorks.HW5;

import java.util.Random;

public class Task2 {
    private static String task = "\n2. Реализовать алгоритм пирамидальной сортировки (HeapSort)\n";
    public static void solution() {
        System.out.println(task);
        int[] array = fill(new int[10]);

        print(array, "До сортровки:");
        heapSort(array);
        print(array, "После сортировки:");
    }

    /**
     * Get interval to heapify
     * @return int
     */
    private static int heapSort(int[] array){
        int temp;
        for (int i = array.length / 2 - 1; i >= 0; i--){
            heapify(array, array.length, i);
        }

        for (int i = array.length - 1; i >= 0; i--){
            temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            heapify(array, i, 0);
        }
        return 0;
    }

    /**
     * Sorted interval
     */
    private static void heapify(int[] array, int heapSize, int rootIndex){
        int temp;
        int largest = rootIndex;
        int leftChild = 2 * rootIndex + 1;
        int rightChild = 2 * rootIndex + 2;

        if(leftChild < heapSize && array[leftChild] > array[largest]) largest = leftChild;
        if (rightChild < heapSize && array[rightChild] > array[largest]) largest = rightChild;

        if (largest != rootIndex){
            temp = array[rootIndex];
            array[rootIndex] = array[largest];
            array[largest] = temp;

            heapify(array, heapSize, largest);
        }
    }

    /**
     * Print array
     */
    private static void print(int[] array, String message){
        System.out.println(message);
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    private static int[] fill(int[] array) {
        Random rnd = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(10);
        }
        return array;
    }
}
