package numeric.PalindromeNumber

import org.junit.Assert
import org.junit.Test
import numeric.PalindromeNumber.PalindromeNumber.isPalindrome

class PalindromeNumberTest {
    @Test
    fun test() {
        Assert.assertEquals( isPalindrome( 121 ) , true )
        Assert.assertEquals( isPalindrome( -121 ) , false )
        Assert.assertEquals( isPalindrome( 10 ) , false )
    }
}