package string.SortingTheSentence

object SortingTheSentence {
    fun sortSentence(s: String): String {
        val array = Array(s.length) { "" }
        var i = 0
        var temp = StringBuilder( " " )
        while (i < s.length) {
            if (s[i] !in '0'..'9') {
                temp.append(s[i])
            } else {
                var index = 0
                while (i < s.length && s[i] in '0'..'9') {
                    index *= 10
                    index += s[i++].toString().toInt()
                }
                if ( index == 1 && temp[0] == ' ' ) temp.delete( 0 , 1 )
                array[index-1] = temp.toString()
                temp = StringBuilder()
                i--
            }
            i++
        }
        temp = StringBuilder()
        for (i in array) {
            if (i != "") {
                temp.append(i)
            } else break
        }
        return temp.toString()
    }
}