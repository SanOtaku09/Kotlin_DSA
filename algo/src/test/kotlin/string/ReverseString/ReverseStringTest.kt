package string.ReverseString
import org.junit.Test
import org.junit.Assert
import string.ReverseString.ReverseString.reverseString
class ReverseStringTest {
    @Test
    fun test() {
        val array = charArrayOf( 'h' , 'e' , 'l' , 'l' , 'o' )
        reverseString( array )
        Assert.assertArrayEquals( array , charArrayOf( 'o' , 'l' , 'l' , 'e' , 'h' ) )
    }
}