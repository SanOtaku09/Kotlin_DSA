package array.ContainsDuplicate

object ContainsDuplicate {
    fun containsDuplicate(nums: IntArray): Boolean {
        val set = HashSet<Int>()
        for ( i in nums ) {
            if ( set.contains( i ) ) return true
            else set.add( i )
        }
        return false
    }
}