package string.MinimumTimeToTypeWordUsingSpecialTypewriter

import org.junit.Assert
import org.junit.Test
import string.MinimumTimeToTypeWordUsingSpecialTypewriter.MinimumTimeToTypeWordUsingSpecialTypewriter.minTimeToType

class MinimumTimeToTypeWordUsingSpecialTypewriterTest {
    @Test
    fun test() {
        Assert.assertEquals( minTimeToType( "abc" ) , 5 )
        Assert.assertEquals( minTimeToType( "bza" ) , 7 )
        Assert.assertEquals( minTimeToType( "zjpc" ) , 34 )
    }
}