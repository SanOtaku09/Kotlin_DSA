package string.longestPalindromicSubstring

object longestPalindromicSubstring {

    var longestPalidrome = ""

    // normal recursive function
    fun String.longestPalidromeSubstringRecursize() : String = longestPalidromeSubstringRecursiveHelper( 0 , length-1 )

    private fun String.longestPalidromeSubstringRecursiveHelper( l : Int , r : Int ) : String {
        if ( l == r ) return  ""
        else if ( isValid( l , r ) ) return  substring( l , r+1 )
        longestPalidromeSubstringRecursiveHelper( l+1 , r ).let { left ->
            longestPalidromeSubstringRecursiveHelper( l , r-1 ).let { right ->
                if ( left.length > right.length ) return left
                else return right
            }
        }
    }

    //dynamic recursive function
    fun String.longestPalidromeSubstring() : String {
        longestPalidromeSubstringHelper( 0 , length-1 )
        return longestPalidrome
    }

    private fun String.longestPalidromeSubstringHelper( l : Int , r : Int ) {
        if ( l == r ) return
        else if ( isValid( l , r ) ) {
            substring( l , r+1 ).let{ newString ->
                if ( newString.length > longestPalidrome.length ){
                    longestPalidrome = newString
                    return
                }
            }
        }
        longestPalidromeSubstringHelper( l+1 , r )
        longestPalidromeSubstringHelper( l , r-1 )
    }

    // common function
    private fun String.isValid( l : Int , r : Int ) : Boolean {
        var low = l ; var high = r
        while ( low <= high ) {
            if ( this[low++] != this[high--] ) return false
        }
        return true
    }


    // dynamic ans without recursion
    var len = 0 ; var length = 0 ; var init = 0
    fun longestPalidromeSubstringWithLoop( s : String ) : String {
        var s = s
        len = s.length
        if ( len <= 1 ) return s
        val array = s.toCharArray()
        var i = 0
        while ( i < len ) {
            i = manacher(array, i)
            i++
        }
        return s.substring( init , init + length )
    }

    fun manacher( array : CharArray , k : Int ) : Int {
        var i = k - 1 ; var j = k
        while ( j < len - 1 && array[j] == array[j+1] ) j++
        var netcentre = j++
        while ( i >= 0 && j < len && array[i] == array[j] ) {
            i--
            j++
        }
        if ( j - i - 1 > length ) {
            length = j - i - 1
            init = i + 1
        }
        return netcentre
    }


}