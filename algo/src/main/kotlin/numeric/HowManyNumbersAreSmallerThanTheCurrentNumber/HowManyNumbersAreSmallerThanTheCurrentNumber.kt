package numeric.HowManyNumbersAreSmallerThanTheCurrentNumber

object HowManyNumbersAreSmallerThanTheCurrentNumber {
    fun smallerNumbersThanCurrent(nums: IntArray): IntArray {
        val ans = IntArray( nums.size ) { 0 }
        for ( i in 0 until nums.size ){
            for ( j in 0 until nums.size ) {
                if ( i == j ) continue
                if ( nums[j] < nums[i] ) ans[i]++
            }
        }
        return ans
    }
}