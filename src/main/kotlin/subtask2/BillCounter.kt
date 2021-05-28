package subtask2

class BillCounter {

    // The output could be "Bon Appetit" or the string with number(e.g "10")
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {

        val billforAnna = bill.toMutableList()
        billforAnna.removeAt(k)
        billforAnna.toIntArray()

        return if (b == billforAnna.sum() / 2) "Bon Appetit"
        else (b - billforAnna.sum() / 2).toString()
    }
}
