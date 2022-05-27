package longestNonRepeativeSubstring
import org.junit.Test
import org.junit.Assert
import string.longestNonRepeativeSubstring.longestNonRepeativeSubstring.getLongestNonRepeativeSubstring
class longestNonRepeativeSubstringTest {
    @Test
    fun test(){
        val input1 = "HelloWorld"
        val input2 = "javaIsAProgrammingLanguage"
        Assert.assertEquals( input1.getLongestNonRepeativeSubstring() , 5)
        Assert.assertEquals( input2.getLongestNonRepeativeSubstring() , 9)
    }
}