package array.NumberOfGoodPairs
import array.NumberOfGoodPairs.NumberOfGoodPairs.numIdenticalPairs
import org.junit.Assert
import org.junit.Test

class NumberOfGoodPairsTest {
    @Test
    fun test() {
        Assert.assertEquals( numIdenticalPairs( intArrayOf( 1,2,3,1,1,3 ) ) , 4 )
        Assert.assertEquals( numIdenticalPairs( intArrayOf( 1,1,1,1 ) ) , 6 )
        Assert.assertEquals( numIdenticalPairs( intArrayOf( 1,2,3 ) ) , 0 )
    }
}