package array.FinalValueOfVariableAfterPerformingOperations

import org.junit.Assert
import org.junit.Test
import array.FinalValueOfVariableAfterPerformingOperations.FinalValueOfVariableAfterPerformingOperations.finalValueAfterOperations

class FinalValueOfVariableAfterPerformingOperationsTest {
    @Test
    fun test() {
        Assert.assertEquals( finalValueAfterOperations( arrayOf( "--X","X++","X++" ) ) , 1 )
        Assert.assertEquals( finalValueAfterOperations( arrayOf( "++X","++X","X++" ) ) , 3 )
        Assert.assertEquals( finalValueAfterOperations( arrayOf( "X++","++X","--X","X--" ) ) , 0 )
    }
}