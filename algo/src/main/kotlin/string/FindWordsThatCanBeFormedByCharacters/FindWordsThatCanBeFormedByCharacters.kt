package string.FindWordsThatCanBeFormedByCharacters

object FindWordsThatCanBeFormedByCharacters {
    fun countCharacters(words: Array<String>, chars: String): Int {
        var count = 0
        val frequency = IntArray( 26 ){ 0 }
        for ( i in chars ) frequency[i-'a']++
        main@for ( i in words ) {
            val copy = frequency.clone()
            for ( j in i ) {
                if ( copy[j-'a'] == 0 ) continue@main else copy[j-'a']--
            }
            count += i.length
        }
        return count
    }
}