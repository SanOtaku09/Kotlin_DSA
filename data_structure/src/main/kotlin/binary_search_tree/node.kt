package binary_search_tree
data class node<T>(
    var data : T ,
    var left : node<T>? = null ,
    var right : node<T>? = null
) {

    override fun toString() : String = getString()

    private fun getString( str : StringBuilder = StringBuilder() ) : String {
        str.append( left?.let { it.data } ?: "null" )
        str.append( " <- " )
        str.append( data )
        str.append( " -> " )
        str.append( right?.let { it.data } ?: "null" )
        str.append( "\n" )
        left?.let{ str.append( it.toString() ) }
        right?.let{ str.append( it.toString() ) }
        return str.toString()
    }

}