package array.ContainsDuplicate

import org.junit.Assert
import org.junit.Test
import array.ContainsDuplicate.ContainsDuplicate.containsDuplicate

class ContainsDuplicateTest {
    @Test
    fun test() {
        Assert.assertEquals( containsDuplicate( intArrayOf( 1,2,3,1 ) ) , true )
        Assert.assertEquals( containsDuplicate( intArrayOf( 1,2,3,4 ) ) , false )
        Assert.assertEquals( containsDuplicate( intArrayOf( 1,1,1,3,3,4,3,2,4,2 ) ) , true )
    }
}