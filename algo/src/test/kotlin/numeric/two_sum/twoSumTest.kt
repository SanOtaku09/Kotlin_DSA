package  numeric.two_sum
import org.junit.Assert
import org.junit.Test
class twoSumTest {
    @Test
    fun test() {
        Assert.assertArrayEquals( twoSum.getTwoSum( intArrayOf( 2,7,11,15 ) , 9 ) , intArrayOf( 0 , 1 ) )
    }
}