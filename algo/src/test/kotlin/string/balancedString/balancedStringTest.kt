package string.balancedString

import org.junit.Assert
import org.junit.Test
import string.balancedString.balancedString.countBalanced

class balancedStringTest {
    @Test
    fun test() {
        Assert.assertEquals( "RLRRLLRLRL".countBalanced() , 4 )
        Assert.assertEquals( "RLLLLRRRLR".countBalanced() , 3 )
        Assert.assertEquals( "LLLLRRRR".countBalanced() , 1 )
    }
}