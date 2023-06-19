package Introduction.HomeWorks.HW3.Kotlin

import Introduction.HomeWorks.HW3.Java.GetNumbers.getList
import java.util.Random

class GetNumbers {

    companion object {
        fun get(size : Int) = getList(size)
    }
    fun getList(size : Int) : ArrayList<Int> {
        val list : ArrayList<Int> = ArrayList(size)
        val rnd = Random()
        for (number in 0..size) {
            list.add(rnd.nextInt())
        }
        return list
    }
}