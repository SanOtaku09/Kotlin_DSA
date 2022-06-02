package string.GoatLatin

import org.junit.Assert
import org.junit.Test
import string.GoatLatin.GoatLatin.toGoatLatin

class GoatLatinTest {
    @Test
    fun test() {
        Assert.assertEquals( toGoatLatin( "I speak Goat Latin" ) ,"Imaa peaksmaaa oatGmaaaa atinLmaaaaa" )
        Assert.assertEquals( toGoatLatin( "The quick brown fox jumped over the lazy dog" ) , "heTmaa uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa overmaaaaaaa hetmaaaaaaaa azylmaaaaaaaaa ogdmaaaaaaaaaa" )
    }
}