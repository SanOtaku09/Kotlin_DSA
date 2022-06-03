package array.KidsWithTheGreatestNumberOfCandies
import array.KidsWithTheGreatestNumberOfCandies.KidsWithTheGreatestNumberOfCandies.kidsWithCandies
import org.junit.Assert
import org.junit.Test

class KidsWithTheGreatestNumberOfCandiesTest {
    @Test
    fun test() {
        Assert.assertArrayEquals(
            kidsWithCandies( intArrayOf( 2,3,5,1,3 ) , 3 ).toTypedArray() ,
            arrayOf( true , true , true , false , true )
        )
        Assert.assertArrayEquals(
            kidsWithCandies( intArrayOf( 4,2,1,1,2 ) , 1 ).toTypedArray() ,
            arrayOf(true,false,false,false,false)
        )
        Assert.assertArrayEquals(
            kidsWithCandies( intArrayOf( 12,1,12 ) , 10 ).toTypedArray() ,
            arrayOf(true,false,true)
        )
    }
}