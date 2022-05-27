package array

import java.util.*
import kotlin.collections.ArrayList

object threeSum {
    fun threeSum( nums : IntArray ) : List<List<Int>> {
        var ans = ArrayList<List<Int>>()
        Arrays.sort( nums )
        var len = nums.size
        var i = 0
        while ( i < len ) {
            var left = i + 1
            var right = len - 1
            while ( left < right ) {
                if ( nums[left] + nums[right] == -nums[i] ) {
                    ans.add( listOf( nums[i] , nums[left] , nums[right] ) )
                    while ( left + 1 < right && nums[left+1] == nums[left] ) left++
                    while ( right - 1 > left && nums[right-1] == nums[right] ) right--
                    left++
                    right--
                } else if ( nums[left] + nums[right] < -nums[i] ) left++
                else right--
            }
            while ( i+1 < len && nums[i+1] == nums[i] ) i++
            i++
        }
        return ans
    }
}