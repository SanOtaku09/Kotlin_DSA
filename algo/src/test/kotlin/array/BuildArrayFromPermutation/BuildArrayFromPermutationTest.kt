package array.BuildArrayFromPermutation

import org.junit.Assert
import org.junit.Test
import array.BuildArrayFromPermutation.BuildArrayFromPermutation.buildArray

class BuildArrayFromPermutationTest {
    @Test
    fun test() {
        Assert.assertArrayEquals( buildArray( intArrayOf( 0,2,1,5,3,4 ) ) , intArrayOf( 0,1,2,4,5,3 ) )
        Assert.assertArrayEquals( buildArray( intArrayOf( 5,0,1,2,3,4 ) ) , intArrayOf( 4,5,0,1,2,3 ) )
    }
}