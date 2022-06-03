package array.FinalValueOfVariableAfterPerformingOperations

object FinalValueOfVariableAfterPerformingOperations {
    fun finalValueAfterOperations(operations: Array<String>): Int {
        var ans = 0
        for ( i in operations ) {
            if ( i[1] == '-' ) ans-- else ans++
        }
        return ans
    }
}