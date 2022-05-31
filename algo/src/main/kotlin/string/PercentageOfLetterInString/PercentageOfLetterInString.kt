package string.PercentageOfLetterInString

object PercentageOfLetterInString {
    fun percentageLetter(s: String, letter: Char): Int {
        var frequency = 0
        for ( i in s ) if ( i == letter ) frequency++
        return ( ( frequency.toDouble() / s.length.toDouble() ) * 100 ).toInt()
    }
}