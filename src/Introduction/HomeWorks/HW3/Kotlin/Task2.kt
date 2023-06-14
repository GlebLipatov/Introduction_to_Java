package Introduction.HomeWorks.HW3.Kotlin

class Task2 {
    fun solution() {
        println("2. Пусть дан произвольный список целых чисел, удалить из него четные числа\n")

        var numbers: ArrayList<Int> = GetNumbers.get(10)
        println("Input list:\n$numbers")
        numbers = removeEven(numbers)
        println("Output list:\n$numbers")
    }

    private fun removeEven(list: ArrayList<Int>): ArrayList<Int> {
        var index = 0
        while (index < list.size) {
            if (list[index] % 2 == 0) list.removeAt(index)
            else index++
        }
        return list
    }
}