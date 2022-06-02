package string.DetermineColorofAChessboardSquare

import org.junit.Assert
import org.junit.Test
import string.DetermineColorofAChessboardSquare.DetermineColorofAChessboardSquare.squareIsWhite

class DetermineColorofAChessboardSquareTest {
    @Test
    fun test() {
        Assert.assertEquals( squareIsWhite( "a1" ) , false )
        Assert.assertEquals( squareIsWhite( "h3" ) , true )
        Assert.assertEquals( squareIsWhite( "c7" ) , false )
        Assert.assertEquals( squareIsWhite( "h8" ) , false )
    }
}