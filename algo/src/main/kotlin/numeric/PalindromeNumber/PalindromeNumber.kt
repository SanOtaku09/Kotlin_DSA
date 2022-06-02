package numeric.PalindromeNumber

object PalindromeNumber {
    fun isPalindrome(x: Int): Boolean {
        if ( x < 0 ) return false
        var temp = x
        var reverse = 0
        while ( temp != 0 ) {
            reverse *= 10
            reverse += temp%10
            temp /= 10
        }
        return x == reverse
    }
}