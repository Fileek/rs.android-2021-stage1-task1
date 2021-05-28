package subtask1

class HappyArray {

    fun convertToHappy(sadArray: IntArray): IntArray {

        var isArrayHappy = false
        val finalArray = sadArray.toMutableList()

        while (!isArrayHappy) {
            isArrayHappy = true
            for (index in 1 until finalArray.size-1) {

                val sum = finalArray[index-1] + finalArray[index+1]
                val element = finalArray[index]

                if (sum < element) {
                    finalArray.removeAt(index)
                    isArrayHappy = false
                    break
                }
            }
        }
        return finalArray.toIntArray()
    }
}
