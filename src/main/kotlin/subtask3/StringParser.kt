package subtask3

class StringParser {

    fun getResult(inputString: String): Array<String> {

        val substrings = mutableListOf<String>()

        with(inputString) {

            fun parseSubstring(char: Char, i: Int, charIncrement: Int) {
                var count = 0
                loop@ for (j in i + 1..lastIndex) {
                    when (get(j)) {
                        char -> count++
                        char + charIncrement -> {
                            if (count == 0) {
                                substrings.add(substring(i + 1 until j))
                                break@loop
                            }
                            count--
                        }
                    }
                }
            }

            for (i in 0..lastIndex) {
                when (get(i)) {
                    '(' -> parseSubstring('(', i, 1)
                    '[' -> parseSubstring('[', i, 2)
                    '<' -> parseSubstring('<', i, 2)

                }
            }
        }
        return substrings.toTypedArray()
    }
}
