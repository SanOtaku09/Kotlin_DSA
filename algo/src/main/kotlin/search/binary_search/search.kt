package search.binary_search
object search{
    fun< T : Comparable <T> > Array<T>.binary_search( value : T ) : Int {
        var left = 0 ; var right = this.size -1 ; var mid = right / 2 
        while ( left <= right ) {
            if ( this[mid] == value ) return mid 
            else if ( this[mid] > value ) right = mid - 1 
            else left = mid + 1
            mid = ( left + right ) / 2
        }
        return -1
    }
}