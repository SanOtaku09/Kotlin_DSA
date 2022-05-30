package string.CountPrefixesOfAGivenString

import org.junit.Assert
import org.junit.Test
import string.CountPrefixesOfAGivenString.CountPrefixesOfAGivenString.countPrefixes

class CountPrefixesOfAGivenStringTest {
    @Test
    fun test() {
        Assert.assertEquals( countPrefixes( arrayOf( "a","b","c","ab","bc","abc" ) , "abc" ) , 3 )
        Assert.assertEquals( countPrefixes( arrayOf( "a" , "a" ) , "aa" ) ,2  )
    }
}