package array.NumberOfGoodPairs

object NumberOfGoodPairs {
    fun numIdenticalPairs(nums: IntArray): Int {
        var count = 0
        for ( i in 0 until nums.size ) {
            for ( j in i +1 until nums.size ) if ( nums[i] == nums[j] ) count++
        }
        return count
    }
}