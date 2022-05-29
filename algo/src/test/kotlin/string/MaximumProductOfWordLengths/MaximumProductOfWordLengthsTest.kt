package string.MaximumProductOfWordLengths

import org.junit.Assert
import org.junit.Test
import string.MaximumProductOfWordLengths.MaximumProductOfWordLengths.maxProduct

class MaximumProductOfWordLengthsTest {
    @Test
    fun test() {
        Assert.assertEquals( maxProduct( arrayOf( "abcw","baz","foo","bar","xtfn","abcdef" ) ) , 16 )
        Assert.assertEquals( maxProduct( arrayOf( "a","ab","abc","d","cd","bcd","abcd" ) ) , 4 )

    }
}