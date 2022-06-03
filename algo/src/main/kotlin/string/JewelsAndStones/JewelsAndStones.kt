package string.JewelsAndStones

object JewelsAndStones {
    fun numJewelsInStones(jewels: String, stones: String): Int {
        val jewel = jewels.toHashSet()
        var count = 0
        for ( i in stones ) if ( jewel.contains(i) ) count++
        return count
    }
}