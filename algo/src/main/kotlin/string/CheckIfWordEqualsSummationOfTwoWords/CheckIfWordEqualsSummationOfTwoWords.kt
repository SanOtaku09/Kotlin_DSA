package string.CheckIfWordEqualsSummationOfTwoWords

object CheckIfWordEqualsSummationOfTwoWords {

    fun isSumEqual(firstWord: String, secondWord: String, targetWord: String): Boolean {
        return targetWord.getValue() == ( firstWord.getValue() + secondWord.getValue() )
    }

    private fun String.getValue() : Int {
        var value = 0
        for ( i in this ) {
            value *= 10
            value += i - 'a'
        }
        return value
    }

}