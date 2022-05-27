package sort.brick_sort
object sort {
    fun <T:Comparable<T>> Array<T>.brick_sort() {
        var is_sorted = false
        while ( ! is_sorted ) {
            is_sorted = true
            for ( i in 1 until this.size -1 step 2 ) {
                if ( this[i] > this[i+1] ){ 
                    this[i] = this[i+1].also{ this[i+1] = this[i] }
                    is_sorted = false
                }
            }
            for ( i in 0 until this.size -1 step 2 ) {
                if ( this[i] > this[i+1] ) {
                    this[i] = this[i+1].also{ this[i+1] = this[i] }
                    is_sorted = false
                }
            }
        }
    }
}