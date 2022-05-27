package string.zig_zag_pattern

import org.junit.Assert
import org.junit.Test
import string.zig_zag_pattern.zigZagPattern.encode

class zigZagPatternTest {
    @Test
    fun palindrome() {
        val input1 = "HelloWorldFromJava"
        val input2 = "javaIsAProgrammingLanguage"
        Assert.assertEquals(input1.encode(4), "HooeWrrmalolFJvlda")
        Assert.assertEquals(input2.encode(4), "jAaLgasPrmgaaevIrgmnnuaoig")
    }
}