package array.SearchA2DMatrix

import org.junit.Test
import array.SearchA2DMatrix.SearchA2DMatrix.searchMatrix
import org.junit.Assert

class SearchA2DMatrixTest {
    @Test
    fun test() {
        Assert.assertEquals( searchMatrix( arrayOf(
            intArrayOf( 1,3,5,7 ) ,
            intArrayOf( 10,11,16,20 ) ,
            intArrayOf( 23,30,34,60 )
        ) , 1 ) , true )
        Assert.assertEquals( searchMatrix( arrayOf(
            intArrayOf( 1,3,5,7 ) ,
            intArrayOf( 10,11,16,20 ) ,
            intArrayOf( 23,30,34,60 )
        ) , 3 ) , true )
        Assert.assertEquals( searchMatrix( arrayOf(
            intArrayOf( 1,3,5,7 ) ,
            intArrayOf( 10,11,16,20 ) ,
            intArrayOf( 23,30,34,60 )
        ) , 60 ) , true )
        Assert.assertEquals(
            searchMatrix(
            arrayOf(
                intArrayOf( 1 ) ,
                intArrayOf( 3 )
            ) , 1 ) , true )
    }
}