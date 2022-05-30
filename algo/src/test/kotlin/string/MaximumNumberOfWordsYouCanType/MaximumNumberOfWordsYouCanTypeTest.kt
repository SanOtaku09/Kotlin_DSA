package string.MaximumNumberOfWordsYouCanType

import org.junit.Assert
import org.junit.Test
import string.MaximumNumberOfWordsYouCanType.MaximumNumberOfWordsYouCanType.canBeTypedWords

class MaximumNumberOfWordsYouCanTypeTest {
    @Test
    fun test() {
        Assert.assertEquals( canBeTypedWords("hello world", "ad" ) , 1 )
        Assert.assertEquals( canBeTypedWords("leet code" ,"lt" ) , 1 )
        Assert.assertEquals( canBeTypedWords("leet code" ,"e" ) , 0 )
    }
}