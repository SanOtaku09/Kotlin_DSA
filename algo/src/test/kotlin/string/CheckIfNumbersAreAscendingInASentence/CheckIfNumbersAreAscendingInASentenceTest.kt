package string.CheckIfNumbersAreAscendingInASentence

import org.junit.Assert
import org.junit.Test
import string.CheckIfNumbersAreAscendingInASentence.CheckIfNumbersAreAscendingInASentence.areNumbersAscending

class CheckIfNumbersAreAscendingInASentenceTest {
    @Test
    fun test() {
        Assert.assertEquals( areNumbersAscending( "1 box has 3 blue 4 red 6 green and 12 yellow marbles" ) , true )
        Assert.assertEquals( areNumbersAscending( "hello world 5 x 5" ) , false )
        Assert.assertEquals( areNumbersAscending( "sunset is at 7 51 pm overnight lows will be in the low 50 and 60 s" ) , false )
    }
}