package string.longestPalindromicSubstring

import org.junit.Assert
import org.junit.Test
import string.longestPalindromicSubstring.longestPalindromicSubstring.longestPalidromeSubstring
import string.longestPalindromicSubstring.longestPalindromicSubstring.longestPalidromeSubstringRecursize

class longestPalindromicSubstringTest {
    @Test
    fun test() {
        val input = "asdabcba"
        val input2 = "asdhellolleh1023"
        Assert.assertEquals( input.longestPalidromeSubstring() , "abcba" )
        Assert.assertEquals( input2.longestPalidromeSubstring() , "hellolleh" )
        Assert.assertEquals( input.longestPalidromeSubstringRecursize() , "abcba" )
        Assert.assertEquals( input2.longestPalidromeSubstringRecursize() , "hellolleh" )
    }
}