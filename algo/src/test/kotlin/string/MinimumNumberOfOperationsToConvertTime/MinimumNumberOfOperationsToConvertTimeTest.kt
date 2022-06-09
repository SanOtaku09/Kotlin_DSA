package string.MinimumNumberOfOperationsToConvertTime

import org.junit.Assert
import org.junit.Test
import string.MinimumNumberOfOperationsToConvertTime.MinimumNumberOfOperationsToConvertTime.convertTime

class MinimumNumberOfOperationsToConvertTimeTest {
    @Test
    fun test(){
        Assert.assertEquals( convertTime( "02:30", "04:35" ) , 3 )
        Assert.assertEquals( convertTime( "09:41", "10:34" ) , 7 )
        Assert.assertEquals( convertTime( "03:48" , "04:16" ) , 6 )
    }
}