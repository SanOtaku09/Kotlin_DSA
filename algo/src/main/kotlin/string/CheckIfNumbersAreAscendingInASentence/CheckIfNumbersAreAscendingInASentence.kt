package string.CheckIfNumbersAreAscendingInASentence

object CheckIfNumbersAreAscendingInASentence {
    fun areNumbersAscending(s: String): Boolean {
        var i = 0
        val len = s.length
        var last = Int.MIN_VALUE
        var temp = 0
        while ( i < len ) {
            if ( s[i] in '0' .. '9' ) {
                while ( i < len && s[i] in '0' .. '9' ) {
                    temp *= 10
                    temp += s[i].toString().toInt()
                    i++
                }
                i--
                if ( temp <= last ) return false
                last = temp
                temp = 0
            }
            i++
        }
        return true
    }
}