package string.MaximumNumberOfBalloons

object MaximumNumberOfBalloons {
    fun maxNumberOfBalloons(text: String): Int {
        val array = IntArray(26){0}
        for ( i in text ) array[i-'a']++
        var count = 0
        while ( array[0] > 0 && array[1] > 0 && array[11] > 1 && array[14] > 1 && array[13] > 0 ) {
            array[0]--
            array[1]--
            array[11] -= 2
            array[14] -= 2
            array[13]--
            count++
        }
        return count
    }
}