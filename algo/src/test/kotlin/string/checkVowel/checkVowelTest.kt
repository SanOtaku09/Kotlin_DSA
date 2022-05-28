package string.checkVowel
import org.junit.Test
import org.junit.Assert
import string.checkVowel.checkVowel.countVowel
import string.checkVowel.checkVowel.hasVowel
class checkVowelTest {
    var input = "hello world"
    var input2 = "HELLO WORLD"
    var input3 = "do YOU knOW mE"
    var input4 = ""
    var input5 = "sdfk"
    @Test
    fun hasVowelTest() {
        Assert.assertTrue( input.hasVowel() )
        Assert.assertTrue( input2.hasVowel() )
        Assert.assertTrue( input3.hasVowel() )
        Assert.assertFalse( input4.hasVowel() )
        Assert.assertFalse( input5.hasVowel() )
    }

    @Test
    fun vowelCount() {
        Assert.assertEquals( input.countVowel() , 3 )
        Assert.assertEquals( input2.countVowel() , 3 )
        Assert.assertEquals( input3.countVowel() , 5 )
        Assert.assertEquals( input4.countVowel() , 0 )
        Assert.assertEquals( input5.countVowel() , 0 )
    }
}