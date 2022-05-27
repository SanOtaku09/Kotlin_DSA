package search.interpolation_search
object search {
    fun IntArray.apply_equation( l : Int , h : Int , key : Int ) : Int = l +  ((( h - l ) / ( this[h] - this[l] ))*(key-this[l]))
    fun IntArray.interpolation_search( key : Int ) : Int {
        if ( key < this[0] || key > this[this.size -1] ) return -1
        var l = 0 ; var h = this.size -1
        var index = this.apply_equation( l , h , key )
        while ( true ) {
            if ( this[index] == key ) return index
            else if ( this[index] < key ) h = index -1
            else l = index+1
            index = this.apply_equation( l , h , key )
        }
    }
}