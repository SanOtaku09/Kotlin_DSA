package  numeric.two_sum
import java.util.HashMap
object twoSum {
    fun getTwoSum(nums: IntArray, target: Int): IntArray {
        val ans = IntArray(2){ -1 }
        val map = HashMap<Int , Int >()
        for ( i in 0 until nums.size ) {
            if ( ! map.containsKey( nums[i] ) ) {
                map.put( target - nums[i] , i )
            } else return map.get( nums[i] ).let{
                if (it != null) {
                    ans[0] = it
                }
                ans[1] = i
                ans
            }
        }
        return ans
    }
}