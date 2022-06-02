package string.LengthOfLastWord

object LengthOfLastWord {
    fun lengthOfLastWord(s: String): Int {
        var i = s.length -1
        while ( i >= 0 && s[i] == ' ' ) i--
        var len = 0
        while ( i >= 0 && s[i--] != ' ' ) len++
        return len
    }
}