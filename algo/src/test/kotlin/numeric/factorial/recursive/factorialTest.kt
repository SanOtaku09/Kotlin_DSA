package numeric.factorial.recursive
import org.junit.Assert
import org.junit.Test
class factorialTest {

    @Test
    fun test() {
        Assert.assertEquals( factorial.getFactorial( 10 ) , 3628800 )
    }

}