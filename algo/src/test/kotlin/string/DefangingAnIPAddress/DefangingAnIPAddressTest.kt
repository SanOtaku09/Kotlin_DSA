package string.DefangingAnIPAddress

import org.junit.Assert
import org.junit.Test
import string.DefangingAnIPAddress.DefangingAnIPAddress.defangIPaddr

class DefangingAnIPAddressTest {
    @Test
    fun test() {
        Assert.assertEquals( defangIPaddr( "1.1.1.1" ) , "1[.]1[.]1[.]1" )
        Assert.assertEquals( defangIPaddr( "255.100.50.0" ) , "255[.]100[.]50[.]0" )
    }
}