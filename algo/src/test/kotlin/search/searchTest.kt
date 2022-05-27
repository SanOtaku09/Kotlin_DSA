package search
import org.junit.Test
import org.junit.Assert
import search.binary_search.search.binary_search
import search.interpolation_search.search.interpolation_search
import search.linear_search.search.linear_search
class searchTest {

    val array = Array<Int>( 10 ) { it+1 }
    val intArray = IntArray( 10 ) { it + 1 }

    @Test
    fun binary_search_test() {
        Assert.assertEquals( array.binary_search( 0 ) , -1 )
        Assert.assertEquals( array.binary_search( 11 ) , -1 )
        for ( i in array ) {
            Assert.assertEquals( array.binary_search( i ) , i-1 )
        }
    }

    @Test
    fun interpolation_search_test() {
        Assert.assertEquals( intArray.interpolation_search( 0 ) , -1 )
        Assert.assertEquals( intArray.interpolation_search( 11 ) , -1 )
        for ( i in array ) {
            Assert.assertEquals( intArray.interpolation_search( i ) , i-1 )
        }
    }

    @Test
    fun linear_search_test() {
        Assert.assertEquals( array.linear_search( 0 ) , -1 )
        Assert.assertEquals( array.linear_search( 11 ) , -1 )
        for ( i in array ) {
            Assert.assertEquals( array.linear_search( i ) , i-1 )
        }
    }

}