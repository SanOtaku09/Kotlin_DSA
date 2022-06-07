package string.CalculateDigitSumOfAString

object CalculateDigitSumOfAString {
    lateinit var ans : StringBuilder
    fun digitSum(s: String, k: Int): String {
        ans = StringBuilder( s )
        while ( ans.length > k ) divide( k )
        return ans.toString()
    }

    fun divide( k : Int ) {
        if ( ans.length <= k ) return
        val prossedString = StringBuilder()
        for ( i in 0 until ans.length step k ) {
            var j = i
            val n = i + k
            var sum = 0
            while ( j < n && j < ans.length ) {
                sum += ans[j++].code - '0'.code
            }
            prossedString.append( sum )
        }
        ans = prossedString
    }
}