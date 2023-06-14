package Introduction.HomeWorks.HW3.Kotlin

class Task1 {
    fun solution() : Unit {
        println("1. Реализовать алгоритм сортировки слиянием(метод взять из Интернета)\n")

        var numbers: ArrayList<Int> = GetNumbers.get(10)
        println("Input list:\n$numbers\n")

        numbers = mergeSort(numbers)
        println("Output list:\n$numbers\n")
    }

    private fun mergeSort(list: ArrayList<Int>): ArrayList<Int> {
        if (list.size < 2) return list

        var leftList: ArrayList<Int> = ArrayList(list.subList(0, list.size / 2))
        var rightList: ArrayList<Int> = ArrayList(list.subList(list.size / 2, list.size))

        leftList = mergeSort(leftList)
        rightList = mergeSort(rightList)

        return mergeList(leftList, rightList)
    }

    private fun mergeList(leftList: ArrayList<Int>, rightList: ArrayList<Int>): ArrayList<Int> {
        var sizeMergedList: Int = leftList.size + rightList.size

        val mergedList: ArrayList<Int> = ArrayList()
        var posLeft: Int = 0
        var posRight: Int = 0

        while (sizeMergedList > 0) {
            if (posLeft == leftList.size) mergedList.add(rightList[posRight++])
            else if (posRight == rightList.size) mergedList.add(leftList[posLeft++])
            else if (leftList[posLeft] < rightList[posRight]) mergedList.add(leftList[posLeft++])
            else mergedList.add(rightList[posRight++])

            sizeMergedList--
        }
        return mergedList
    }
}