package string.ReverseWordsInAStringIII

import org.junit.Assert
import org.junit.Test
import string.ReverseWordsInAStringIII.ReverseWordsInAStringIII.reverseWords

class ReverseWordsInAStringIIITest {
    @Test
    fun test() {
        Assert.assertEquals( "Let's take LeetCode contest".reverseWords() , "s'teL ekat edoCteeL tsetnoc" )
        Assert.assertEquals( "God Ding".reverseWords() , "doG gniD" )
    }
}