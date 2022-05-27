package search.linear_search
object search {
    fun < T : Comparable< T > > Array<T>.linear_search( value : T ) : Int {
        for ( i in 0 until this.size ) if ( this[i] == value ) return i 
        return -1
    }
}