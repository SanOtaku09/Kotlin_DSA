package string.checkVowel
import java.util.*

object checkVowel {
    var VOWEL = HashSet<Char>(Arrays.asList('a', 'e', 'i', 'o', 'u'))
    fun String.hasVowel(): Boolean = this.countVowel() > 0
    fun String.countVowel() : Int {
        var vowelCount = 0
        for ( i in this.lowercase() )
            if ( VOWEL.contains( i ) ) vowelCount++
        return vowelCount
    }
}