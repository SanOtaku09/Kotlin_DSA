package array.ShuffleTheArray

object ShuffleTheArray {
    fun shuffle(nums: IntArray, n: Int): IntArray {
        var x = 0 ; var y = n
        return IntArray( nums.size ) {
            if ( it % 2 == 0 ) {
                nums[x++]
            } else {
                nums[y++]
            }
        }
    }
}