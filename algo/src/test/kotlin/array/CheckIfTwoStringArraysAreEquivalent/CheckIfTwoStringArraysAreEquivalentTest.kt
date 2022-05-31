package array.CheckIfTwoStringArraysAreEquivalent

import org.junit.Assert
import org.junit.Test
import array.CheckIfTwoStringArraysAreEquivalent.CheckIfTwoStringArraysAreEquivalent.arrayStringsAreEqual

class CheckIfTwoStringArraysAreEquivalentTest {
    @Test
    fun test() {
        Assert.assertEquals( arrayStringsAreEqual( arrayOf( "ab", "c" ) , arrayOf( "a", "bc" ) ) , true )
        Assert.assertEquals( arrayStringsAreEqual( arrayOf( "a", "cb" ) , arrayOf( "ab", "c" ) ) , false )
        Assert.assertEquals( arrayStringsAreEqual( arrayOf( "abc", "d", "defg" ) , arrayOf( "abcddefg" ) ) , true )
    }
}