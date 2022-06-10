package string.CapitalizeTheTitle

object CapitalizeTheTitle {
    fun capitalizeTitle(title: String): String {
        val ans = StringBuilder()
        var start = 0
        for ( i in 0 .. title.length ) {
            if ( i == title.length || title[i] == ' ' ) {
                if ( i - start < 3 ) {
                    ans.append( title.substring( start , i ).lowercase() )
                } else {
                    ans.append( title[start].uppercase() )
                    ans.append( title.substring( start+1 , i ).lowercase() )
                }
                if ( i != title.length ) ans.append( " " )
                start = i +1
            }
        }
        return ans.toString()
    }
}