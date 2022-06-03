package array.TwoSumIIInputArrayIsSorted

object TwoSumIIInputArrayIsSorted {
    fun twoSum(numbers: IntArray, target: Int): IntArray {
        for ( i in 0 until numbers.size ) {
            val find = target - numbers[i]
            for ( j in numbers.size-1 downTo 0 ) {
                if ( i == j ) continue
                if ( numbers[j] == find ) return intArrayOf( i+1 , j+1 )
            }
        }
        return IntArray( 0 )
    }
}