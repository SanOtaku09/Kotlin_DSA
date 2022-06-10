package string.ReformatDate

object ReformatDate {
    val getMonth = hashMapOf(
        "Jan" to "01" ,
        "Feb" to "02" ,
        "Mar" to "03" ,
        "Apr" to "04" ,
        "May" to "05" ,
        "Jun" to "06" ,
        "Jul" to "07" ,
        "Aug" to "08" ,
        "Sep" to "09" ,
        "Oct" to "10" ,
        "Nov" to "11" ,
        "Dec" to "12"
    )
    fun reformatDate(date: String): String {
        val ans = StringBuilder()
        val len = date.length
        ans.append( date.substring( len-4 ) )
        ans.append( "-" )
        ans.append( getMonth[ date.substring( len - 8 , len-5 ) ] )
        ans.append( "-" )
        if ( len - 11 == 1 ) ans.append( "0" )
        ans.append( date.substring( 0 , len - 11 ) )
        return ans.toString()
    }
}