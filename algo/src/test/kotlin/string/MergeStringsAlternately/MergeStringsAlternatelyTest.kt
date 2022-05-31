package string.MergeStringsAlternately

import org.junit.Assert
import org.junit.Test
import string.MergeStringsAlternately.MergeStringsAlternately.mergeAlternately

class MergeStringsAlternatelyTest {
    @Test
    fun test() {
        Assert.assertEquals( mergeAlternately( "abc" , "pqr" ) ,"apbqcr" )
        Assert.assertEquals( mergeAlternately( "ab" , "pqrs" ) , "apbqrs" )
        Assert.assertEquals( mergeAlternately( "abcd" ,"pq" ) ,"apbqcd" )
    }
}