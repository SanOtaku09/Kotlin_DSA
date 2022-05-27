package sort.bubble_sort
object sort {
    fun < T : Comparable < T >> Array<T>.bubble_sort() {
        var len = this.size - 1 
        for ( i in 0 .. len ) {
            for ( j in 0 until len ) {
                if ( this[j] > this[j+1] ){
                    this[j+1] = this[j].also{ this[j] = this[j+1] }
                } else if ( j == len ) return
            }
        }
    }
}