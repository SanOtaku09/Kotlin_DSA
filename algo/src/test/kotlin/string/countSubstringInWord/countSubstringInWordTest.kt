package string.countSubstringInWord

import org.junit.Assert
import org.junit.Test
import string.countSubstringInWord.countSubstringInWord.count

class countSubstringInWordTest {
    @Test
    fun test() {
        Assert.assertEquals( arrayOf( "a","abc","bc","d" ).count( "abc" ) , 3 )
        Assert.assertEquals( arrayOf( "a","b","c" ).count( "aaaaabbbbb" ) , 2 )
        Assert.assertEquals( arrayOf( "a","a","a" ).count( "ab" ) , 3 )
    }
}