package numeric.factorial.using_loop
import org.junit.Assert
import org.junit.Test
class factoiralTest {
    @Test
    fun test() {
        Assert.assertEquals( factoiral.getFactorial( 10 ) , 3628800 )
    }
}