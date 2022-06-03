package array.FindTargetIndicesAfterSortingArray

import java.util.*
import kotlin.collections.ArrayList

object FindTargetIndicesAfterSortingArray {
    fun targetIndices(nums: IntArray, target: Int): List<Int> {
        val indexes = ArrayList<Int>( nums.size )
        Arrays.sort( nums )
        var i = 0
        while ( i < nums.size && nums[i] != target ) i++
        while ( i < nums.size && nums[i] == target ) indexes.add( i++ )
        return indexes
    }
}