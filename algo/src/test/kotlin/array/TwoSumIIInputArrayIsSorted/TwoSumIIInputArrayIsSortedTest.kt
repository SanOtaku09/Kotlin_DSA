package array.TwoSumIIInputArrayIsSorted

import org.junit.Assert
import org.junit.Test
import array.TwoSumIIInputArrayIsSorted.TwoSumIIInputArrayIsSorted.twoSum

class TwoSumIIInputArrayIsSortedTest {
    @Test
    fun test() {
        Assert.assertArrayEquals( twoSum( intArrayOf( 2,7,11,15 ) , 9 ) , intArrayOf( 1 , 2 ) )
    }
}