package numeric.ThousandSeparator
import numeric.ThousandSeparator.ThousandSeparator.thousandSeperator
import org.junit.Assert
import org.junit.Test

class ThousandSeparatorTest {
    @Test
    fun test() {
        Assert.assertEquals( thousandSeperator( 987 ) , "987" )
        Assert.assertEquals( thousandSeperator( 0 ) , "0" )
        Assert.assertEquals( thousandSeperator( 1234 ) , "1.234" )
    }
}