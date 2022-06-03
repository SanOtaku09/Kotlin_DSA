package array.KidsWithTheGreatestNumberOfCandies

object KidsWithTheGreatestNumberOfCandies {
    fun kidsWithCandies(candies: IntArray, extraCandies: Int): List<Boolean> {
        var max = 0
        for ( i in candies ) if ( max < i ) max = i
        val list = ArrayList<Boolean>( candies.size )
        for ( candy in candies ) list.add( candy+extraCandies >= max )
        return list
    }
}