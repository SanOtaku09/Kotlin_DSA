package array.SingleNumber
import kotlin.collections.HashSet

object SingleNumber {
    fun singleNumber( nums : IntArray ) : Int {
        val set = HashSet<Int>()
        for ( i in nums ) if ( set.contains( i ) ) set.remove( i ) else set.add( i )
        return set.first()
    }
}