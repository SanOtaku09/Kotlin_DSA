package string.CheckWhetherTwoStringsAreAlmostEquivalent

import org.junit.Assert
import org.junit.Test
import string.CheckWhetherTwoStringsAreAlmostEquivalent.CheckWhetherTwoStringsAreAlmostEquivalent.checkAlmostEquivalent

class CheckWhetherTwoStringsAreAlmostEquivalentTest {
    @Test
    fun test() {
        Assert.assertEquals( checkAlmostEquivalent( "aaaa", "bccb" ) , false )
        Assert.assertEquals( checkAlmostEquivalent( "abcdeef", "abaaacc") , true )
        Assert.assertEquals( checkAlmostEquivalent( "cccddabba", "babababab" ) , true )
        Assert.assertEquals( checkAlmostEquivalent( "dfgcbehcifihghedhffbggdcebbbghigfhddhiigcgfeiih","cdcgbeeceifbgchhfiffhifghiebfchbcbfhggchfbbhddb" ) , true )

    }
}