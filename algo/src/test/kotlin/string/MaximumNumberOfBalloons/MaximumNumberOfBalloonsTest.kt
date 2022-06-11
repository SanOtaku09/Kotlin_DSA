package string.MaximumNumberOfBalloons

import org.junit.Assert
import org.junit.Test
import string.MaximumNumberOfBalloons.MaximumNumberOfBalloons.maxNumberOfBalloons

class MaximumNumberOfBalloonsTest {
    @Test
    fun test() {
        Assert.assertEquals( maxNumberOfBalloons( "nlaebolko" ) , 1 )
        Assert.assertEquals( maxNumberOfBalloons( "loonbalxballpoon" ) , 2 )
        Assert.assertEquals( maxNumberOfBalloons( "leetcode" ) , 0 )
        Assert.assertEquals( maxNumberOfBalloons( "ballon" ) , 0 )
        Assert.assertEquals( maxNumberOfBalloons( "balllllllllllloooooooooon" ) , 1 )
    }
}