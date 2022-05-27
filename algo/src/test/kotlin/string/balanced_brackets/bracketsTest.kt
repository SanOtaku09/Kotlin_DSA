package string.balanced_brackets
import org.junit.Assert
import org.junit.Test
import string.balanced_brackets.brackets.balanced_brackets

class bracketsTest {
    @Test
    fun test() {
        val input1 = "(1){2}[3]"
        val input2 = "({{[12+34](12)}}){23}(12)[12]"
        val input3 = "([{12]11})"
        val input4 = "{[234](35))(11){}"
        Assert.assertTrue( input1.balanced_brackets() )
        Assert.assertTrue( input2.balanced_brackets() )
        Assert.assertFalse( input3.balanced_brackets() )
        Assert.assertFalse( input4.balanced_brackets() )
    }
}