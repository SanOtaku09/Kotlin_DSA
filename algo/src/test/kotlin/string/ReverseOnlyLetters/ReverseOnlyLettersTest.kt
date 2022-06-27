package string.ReverseOnlyLetters

import org.junit.Assert
import org.junit.Test
import string.ReverseOnlyLetters.ReverseOnlyLetters.reverseOnlyLetters

class ReverseOnlyLettersTest {
    @Test
    fun test() {
        Assert.assertEquals( reverseOnlyLetters( "ab-cd" ) , "dc-ba" )
        Assert.assertEquals( reverseOnlyLetters( "a-bC-dEf-ghIj" ) , "j-Ih-gfE-dCba" )
        Assert.assertEquals( reverseOnlyLetters( "Test1ng-Leet=code-Q!" ) , "Qedo1ct-eeLg=ntse-T!" )
        Assert.assertEquals( reverseOnlyLetters( "-" ) , "-" )
    }
}