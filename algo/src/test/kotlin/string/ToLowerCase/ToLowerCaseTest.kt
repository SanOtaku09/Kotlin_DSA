package string.ToLowerCase
import org.junit.Assert
import org.junit.Test
import string.ToLowerCase.ToLowerCase.toLowerCase
class ToLowerCaseTest {
    @Test
    fun test() {
        Assert.assertEquals( toLowerCase( "Hello" ) , "hello" )
        Assert.assertEquals( toLowerCase( "here" ) , "here" )
        Assert.assertEquals( toLowerCase( "LOVELY" ) , "lovely" )
    }
}