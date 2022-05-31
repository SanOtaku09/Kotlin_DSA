package string.CountTheNumberOfConsistentStrings

import org.junit.Assert
import org.junit.Test
import string.CountTheNumberOfConsistentStrings.CountTheNumberOfConsistentStrings.countConsistentStrings

class CountTheNumberOfConsistentStringsTest {
    @Test
    fun test() {
        Assert.assertEquals( countConsistentStrings( "ab" , arrayOf( "ad","bd","aaab","baa","badab" ) ) , 2 )
        Assert.assertEquals( countConsistentStrings( "abc" , arrayOf( "a","b","c","ab","ac","bc","abc" ) ) , 7 )
        Assert.assertEquals( countConsistentStrings( "cad" , arrayOf( "cc","acd","b","ba","bac","bad","ac","d" ) ) , 4 )
    }
}