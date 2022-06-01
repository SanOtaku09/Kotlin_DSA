package string.RobotReturnToOrigin

import org.junit.Assert
import org.junit.Test
import string.RobotReturnToOrigin.RobotReturnToOrigin.judgeCircle

class RobotReturnToOriginTest {
    @Test
    fun test() {
        Assert.assertEquals( judgeCircle( "UD" ) , true )
        Assert.assertEquals( judgeCircle("LL" ) , false )
    }
}