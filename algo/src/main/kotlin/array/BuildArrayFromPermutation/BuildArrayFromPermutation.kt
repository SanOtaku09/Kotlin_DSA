package array.BuildArrayFromPermutation

object BuildArrayFromPermutation {
    fun buildArray(nums: IntArray): IntArray {
        return IntArray( nums.size ){ nums[nums[it]] }
    }
}