package array.ConcatenationOfArray

object ConcatenationOfArray {
    fun getConcatenation(nums: IntArray): IntArray {
        return IntArray( 2 * nums.size ) { nums[ it % nums.size ] }
    }
}