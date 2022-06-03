package array.ShuffleTheArray

import org.junit.Assert
import org.junit.Test
import array.ShuffleTheArray.ShuffleTheArray.shuffle

class ShuffleTheArrayTest {
    @Test
    fun test() {
        Assert.assertArrayEquals( shuffle( intArrayOf( 2,5,1,3,4,7 ) , 3 ) , intArrayOf( 2,3,5,4,1,7 ) )
        Assert.assertArrayEquals( shuffle( intArrayOf( 1,2,3,4,4,3,2,1 ) , 4 ) , intArrayOf( 1,4,2,3,3,2,4,1 ) )
        Assert.assertArrayEquals( shuffle( intArrayOf( 1,1,2,2 ) , 2 ) , intArrayOf( 1,2,1,2 ) )
    }
}