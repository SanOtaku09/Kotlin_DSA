package array.SearchA2DMatrix

object SearchA2DMatrix {

    fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
        if ( target < matrix[0][0] || target > matrix[matrix.size-1][matrix[matrix.size-1].size-1] ) return false
        for ( row in matrix ) {
            if ( row[0] == target || row[row.size-1] == target ) return true
            else if ( row[0] < target && row[row.size-1] > target ) return lookInRow( row , target )
        }
        return false
    }

    private fun lookInRow( row : IntArray , target : Int ) : Boolean {
        var l = 0 ; var r = row.size - 1 ; var mid = r/2
        while ( l <= r ) {
            if ( row[mid] == target ) return true
            else if ( row[mid] < target ) {
                l = mid+1
            } else r = mid -1
            mid = (l+r) /2
        }
        return false
    }
}