package Introduction.HomeWorks.HW4;

import java.util.Arrays;

public class Task4 {
    private Integer[] array = new Integer[0];
    private String task = "\n4. Реализовать стэк с помощью массива. " +
            "Нужно реализовать методы: size(), empty(), push(), peek(), pop().\n ";

    public String getTask() {
        return this.task;
    }

    public Integer[] get() {
        if (isEmpty()) return null;
        return this.array;
    }

    public boolean isEmpty() {
        if (this.array == null || this.array.length == 0) return true;
        return false;
    }

    public Integer size() {
        if (isEmpty())
            return 0;
        return this.array.length;
    }

    public void push(int value) {
        if (this.array == null) {
            this.array = new Integer[1];
            this.array[0] = value;
        } else {
            Integer[] newArray = new Integer[this.array.length + 1];
            newArray[0] = value;
            for (int i = 1; i < newArray.length; i++) {
                newArray[i] = array[i - 1];
            }
            this.array = newArray;
        }
    }

    public Integer peek() {
        if (isEmpty())
            return null;
        return array[0];
    }

    public Integer pop() {
        if (isEmpty()) {
            return null;
        } else {
            int result = array[0];
            if (size() > 1) {
                this.array = Arrays.copyOfRange(array, 1, this.array.length);
            } else {
                this.array = null;
            }
            return result;
        }
    }
}
