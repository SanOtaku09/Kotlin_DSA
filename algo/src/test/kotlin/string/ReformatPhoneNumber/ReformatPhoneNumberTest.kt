package string.ReformatPhoneNumber
import org.junit.Assert
import org.junit.Test
import string.ReformatPhoneNumber.ReformatPhoneNumber.reformatNumber

class ReformatPhoneNumberTest {
    @Test
    fun test() {
        Assert.assertEquals( reformatNumber( "1-23-45 6" ) , "123-456" )
        Assert.assertEquals( reformatNumber( "123 4-567" ) ,  "123-45-67" )
        Assert.assertEquals( reformatNumber( "123 4-5678" ) , "123-456-78" )
        Assert.assertEquals( reformatNumber( "--17-5 229 35-39475 " ) , "175-229-353-94-75" )
    }
}