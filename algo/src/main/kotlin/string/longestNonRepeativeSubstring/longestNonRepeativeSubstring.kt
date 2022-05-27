package string.longestNonRepeativeSubstring
import java.util.HashMap
object longestNonRepeativeSubstring {
    fun String.getLongestNonRepeativeSubstring() : Int {
        var map = HashMap<Char,Int>()
        var max = 0 
        var start = 0
        var index = 0
        while ( index < this.length ) {
            var temp = this[index]
            if ( !map.containsKey( temp ) )
                map.put( temp , 0 )
            else if ( this[start] == temp ) 
                start++
            else if ( this[index-1] == temp ) {
                if (max < map.size) max = map.size
                map = HashMap<Char, Int>()
                start = index
                index--
            }
            else {
                if (max < map.size) max = map.size
                while (this[start] != temp) {
                    map.remove(this[start])
                    start++
                }
                start++
            }
            index++
        }
        if ( max < map.size ) max = map.size
        return max
    }
}