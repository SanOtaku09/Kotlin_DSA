package string.ImplementstrStr
import org.junit.Test
import org.junit.Assert
import string.ImplementstrStr.ImplementstrStr.strStr

class ImplementstrStrTest {
    @Test
    fun test() {
        Assert.assertEquals( strStr( "hello" , "ll" ) , 2 )
        Assert.assertEquals( strStr( "aaaaa" , "bba" ) , -1 )
        Assert.assertEquals( strStr( "a" , "a" ) , 0 )
        Assert.assertEquals( strStr( "abc" , "c" ) , 2 )
    }
}