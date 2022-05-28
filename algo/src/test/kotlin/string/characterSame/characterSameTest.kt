package string.characterSame

import org.junit.Assert
import org.junit.Test
import string.characterSame.characterSame.isAllCharacterSame
import string.characterSame.characterSame.isAllCharacterSame2

class characterSameTest {
    @Test
    fun test() {
        var input = "aaaaa"
        var input2 = "aaaab"
        var input3 = "11111"
        var input4 = "11112"
        Assert.assertTrue( input.isAllCharacterSame() )
        Assert.assertTrue( input.isAllCharacterSame2() )
        Assert.assertFalse( input2.isAllCharacterSame() )
        Assert.assertFalse( input2.isAllCharacterSame2() )
        Assert.assertTrue( input3.isAllCharacterSame() )
        Assert.assertTrue( input3.isAllCharacterSame2() )
        Assert.assertFalse( input4.isAllCharacterSame() )
        Assert.assertFalse( input4.isAllCharacterSame2() )
    }
}