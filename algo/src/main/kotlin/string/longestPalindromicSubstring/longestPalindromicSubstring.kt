package string.longestPalindromicSubstring

object longestPalindromicSubstring {

    var longestPalidrome = ""

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
                }
            }
        }
        longestPalidromeSubstringHelper( l+1 , r )
        longestPalidromeSubstringHelper( l , r-1 )
    }

    private fun String.isValid( l : Int , r : Int ) : Boolean {
        var low = l ; var high = r
        while ( low <= high ) {
            if ( this[low++] != this[high--] ) return false
        }
        return true
    }

}