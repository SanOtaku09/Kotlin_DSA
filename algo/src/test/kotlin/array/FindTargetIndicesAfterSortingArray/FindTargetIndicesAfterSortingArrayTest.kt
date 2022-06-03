package array.FindTargetIndicesAfterSortingArray

import org.junit.Test
import array.FindTargetIndicesAfterSortingArray.FindTargetIndicesAfterSortingArray.targetIndices
import org.junit.Assert

class FindTargetIndicesAfterSortingArrayTest {
    @Test
    fun test() {
        Assert.assertArrayEquals(
            targetIndices( intArrayOf(1,2,5,2,3) , 2 ).toTypedArray() ,
            arrayOf( 1,2 )
        )
        Assert.assertArrayEquals(
            targetIndices( intArrayOf(1,2,5,2,3) , 3 ).toTypedArray() ,
            arrayOf( 3 )
        )
        Assert.assertArrayEquals(
            targetIndices( intArrayOf(1,2,5,2,3) , 5 ).toTypedArray() ,
            arrayOf( 4 )
        )
    }
}