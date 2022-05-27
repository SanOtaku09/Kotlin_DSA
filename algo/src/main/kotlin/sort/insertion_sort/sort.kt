package sort.insertion_sort
object sort {
    fun < T : Comparable<T> > Array<T>.insertion_sort() {
        for ( i in 1 until this.size ) {
            val key = this[i]
            var index = i - 1
            while ( index > -1 && this[index] > key ) {
                this[index+1] = this[index]
                index--
            }
            this[index+1] = key
        }
    }
}