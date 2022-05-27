package string.alphabetical_order
import org.junit.Assert
import org.junit.Test
class alphabeticTest {
    @Test
    fun test() {
        val input = "abcdefghi"
        val input2 = "admnz"
        val input3 = "asdcf"
        val input4 = "124adfg"
        Assert.assertTrue( alphabetic.alphabetical_order( input ) )
        Assert.assertTrue( alphabetic.alphabetical_order( input2 ) )
        Assert.assertFalse( alphabetic.alphabetical_order( input3 ) )
        Assert.assertFalse( alphabetic.alphabetical_order( input4 ) )
    }
}