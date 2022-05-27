package sort.selection_sort
object sort { 
    fun < T : Comparable<T>> Array<T>.selection_sort() {
        for ( i in  0 until this.size ) {
            var smallest = i
            for ( j in i+1 until this.size ) 
                if ( this[j] < this[smallest] ) smallest = j
            this[i] = this[smallest].also { this[smallest] = this[i] }
        }
    }
}