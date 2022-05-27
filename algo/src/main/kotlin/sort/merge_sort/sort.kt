package sort.merge_sort
object sort {

    fun < T : Comparable<T> > Array<T>.merge_sort() = merge_sort( this , 0 , this.size-1 )

    private tailrec fun < T : Comparable<T> > merge_sort( array : Array<T> , l : Int , r : Int ) {
        if ( r <= l ) return
        val m = l + ( r - l ) / 2
        merge_sort( array , l , m )
        merge_sort( array , m+1 , r )
        merge( array , l , m , r )
    }

    private fun < T : Comparable<T> > merge( array : Array<T> , l : Int , m : Int , r : Int , copy : Array<T> = arrayOfNulls<Comparable<*>>( array.size ) as Array<T> ) {
        System.arraycopy( array , l , copy , l , r - l +1 )
        var i = l
        var j = m+1
        var k = l
        while ( i <= m && j <= r ) {
            if ( copy[i] < copy[j] ) array[k++] = copy[i++]
            else array[k++] = copy[j++]
        }
        while ( i <= m ) {
            array[k++] = copy[i++]
        }
        while ( j <= r ) {
            array[k++] = copy[j++]
        }
    }

}