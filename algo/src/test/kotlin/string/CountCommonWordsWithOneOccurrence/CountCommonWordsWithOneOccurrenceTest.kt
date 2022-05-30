package string.CountCommonWordsWithOneOccurrence

import org.junit.Assert
import org.junit.Test
import string.CountCommonWordsWithOneOccurrence.CountCommonWordsWithOneOccurrence.countWords

class CountCommonWordsWithOneOccurrenceTest {
    @Test
    fun test() {
        Assert.assertEquals( countWords( arrayOf( "leetcode","is","amazing","as","is" ) , arrayOf( "amazing","leetcode","is" ) ) , 2 )
        Assert.assertEquals( countWords( arrayOf( "b","bb","bbb" ) , arrayOf( "a","aa","aaa" ) ) , 0 )
        Assert.assertEquals( countWords( arrayOf( "a","ab" ) , arrayOf( "a","a","a","ab" ) ) , 1 )
    }
}