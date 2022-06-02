package string.StringMatchingInAnArray

import org.junit.Assert
import org.junit.Test
import string.StringMatchingInAnArray.StringMatchingInAnArray.stringMatching

class StringMatchingInAnArrayTest {
    @Test
    fun test() {
        Assert.assertArrayEquals( stringMatching( arrayOf( "mass","as","hero","superhero" ) ).toTypedArray() , arrayOf( "as" , "hero" ) )
        Assert.assertArrayEquals( stringMatching( arrayOf( "leetcode","et","code" ) ).toTypedArray() , arrayOf( "et" , "code" ) )
        Assert.assertArrayEquals( stringMatching( arrayOf( "blue","green","bu" ) ).toTypedArray() , Array<String>(0){""} )
    }
}