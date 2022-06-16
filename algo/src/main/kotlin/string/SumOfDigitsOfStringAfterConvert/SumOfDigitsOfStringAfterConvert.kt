package string.SumOfDigitsOfStringAfterConvert

object SumOfDigitsOfStringAfterConvert {
    fun getLucky(s: String, k: Int): Int {
        var ans = 0
        // if zero which is a special case because it can exceed integer range for long string
        if ( k == 0 ) {
            for ( i in s ) {
                var temp = (i-'a')+1
                var reversedNum = 0
                while ( temp != 0 ) {
                    reversedNum *= 10
                    reversedNum += temp % 10
                    temp /= 10
                }
                while ( reversedNum != 0 ) {
                    ans *= 10
                    ans += reversedNum%10
                    reversedNum /= 10
                }
            }
            return ans
        }
        // for normal cases where k is greater than zero
        for ( i in s ) {
            var temp = (i-'a')+1
            while ( temp != 0 ) {
                ans += temp%10
                temp /= 10
            }
        }
        var i = 1
        while ( i != k ) {
            var temp = 0
            while ( ans.toInt() != 0 ) {
                temp += ans%10
                ans /= 10
            }
            ans = temp
            i++
        }
        return ans
    }
}