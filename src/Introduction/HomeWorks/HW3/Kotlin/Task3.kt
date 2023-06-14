package Introduction.HomeWorks.HW3.Kotlin

class Task3 {
    fun solution(): Unit {
        println("\n3. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.\n")

        val numbers: ArrayList<Int> = GetNumbers.get(10)
        println("Input list:\n$numbers\n")

        val minValue: Int = getMinValue(numbers)
        println("Min value: $minValue")

        val maxValue: Int = getMaxValue(numbers)
        println("Max value: $maxValue")

        val averageValue: Int = getAverageValue(numbers)
        println("Average value: $averageValue")
    }

    private fun getAverageValue(list: java.util.ArrayList<Int>): Int {
        var averageValue: Int = 0;
        for (number in list) averageValue += number

        return averageValue / list.size
    }

    private fun getMaxValue(list: java.util.ArrayList<Int>): Int {
        var maxValue: Int = Int.MIN_VALUE
        for (number in list) {
            if (maxValue < number) maxValue = number
        }
        return maxValue
    }

    private fun getMinValue(list: java.util.ArrayList<Int>): Int {
        var minValue: Int = Int.MAX_VALUE
        for (number in list) {
            if (minValue > number) minValue = number
        }
        return minValue
    }
}